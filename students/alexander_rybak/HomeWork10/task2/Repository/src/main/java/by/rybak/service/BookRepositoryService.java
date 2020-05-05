package by.rybak.service;

import by.rybak.bean.Book;
import by.rybak.exceptions.ItemNotFoundException;
import by.rybak.interfaces.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepositoryService implements Repository<Book> {

    private Map<String, Book> map = new HashMap<>();

    @Override
    public List<Book> findAll() {
        List<Book> list = new ArrayList<>();
        for (Map.Entry<String, Book> entry : map.entrySet()) {
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        for (Map.Entry<String, Book> entry : map.entrySet()) {
            if (entry.getValue().getId().equals(id)) {
                return entry.getValue();
            }
        }
        throw new ItemNotFoundException("There is no book with this id");
    }

    @Override
    public void save(Book item) {
        map.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (map.containsKey(id)) {
            map.remove(id);
        } else {
            throw new ItemNotFoundException("There is no book with this id");
        }
    }
}
