package by.mmkle.repository;

import by.mmkle.bean.Book;
import by.mmkle.exception.ItemNotFoundException;
import by.mmkle.interfaces.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    private Map<String, Book> shelve = new HashMap<>();

    @Override
    public List<Book> findAll() {
        List<Book> list = new ArrayList<>();
        for (Map.Entry<String, Book> entry : shelve.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        if (isBookInLibrary(id)){
            return shelve.get(id);
        } else {
            throw new ItemNotFoundException("Book with id = " + id + " not found");
        }
    }

    @Override
    public void save(Book item) {
        shelve.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if (isBookInLibrary(id)) {
            shelve.remove(id);
        } else {
            throw new ItemNotFoundException("Book with id = " + id + " not found");
        }
    }

    private boolean isBookInLibrary(String id) {
        return shelve.containsKey(id);
    }
}
