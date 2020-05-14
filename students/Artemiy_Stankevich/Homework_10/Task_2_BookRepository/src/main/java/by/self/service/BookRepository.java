package by.self.service;

import by.self.Interface.Repository;
import by.self.bean.Book;
import by.self.exception.ItemNotFoundException;
import java.util.*;

public class BookRepository<T extends Book> implements Repository<T> {

    private final Map<String, T> library = new HashMap<>();

    @Override
    public List<T> findAll() {
        List<T> allBooks = new ArrayList<>();
        for (Map.Entry<String, T> entry : library.entrySet()) {
            allBooks.add(entry.getValue());
        }
        return allBooks;
    }

    @Override
    public T findById(String id) throws ItemNotFoundException {
        for (Map.Entry<String, T> entry : library.entrySet()) {
            if (entry.getKey().equals((id))) {
                return entry.getValue();
            }
        }
        throw new ItemNotFoundException("can not find a book with this id: " + id);
    }

    @Override
    public void save(T item) {
        library.put(item.getId(), item);
        System.out.println(item.getName() + " saved under ID: " + item.getId());
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
        if(library.containsKey(id)) {
            library.remove(id);
            System.out.println("book: " + id + " was been deleted");
        } else throw new ItemNotFoundException("Cant find this book");
    }
}
