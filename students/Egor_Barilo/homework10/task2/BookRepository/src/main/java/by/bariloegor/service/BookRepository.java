package by.bariloegor.service;

import by.bariloegor.bean.Book;
import by.bariloegor.exceptions.ItemNotFoundException;
import by.bariloegor.interfaces.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookRepository implements Repository<Book> {
    public static final Map<String, Book> library = new HashMap<>();

    public BookRepository() {
    }

    @Override
    public List<Book> findAll() {
        List<Book> books = new ArrayList<>();
        for(Map.Entry<String, Book> entry : BookRepository.library.entrySet()){
            books.add(entry.getValue());
        }
        return books;
    }

    @Override
    public Book findById(String id) throws ItemNotFoundException {
        for(Map.Entry<String,Book> entry : BookRepository.library.entrySet()){
            if(entry.getKey().equals(id)){
                return entry.getValue();
            }
        }
        throw new ItemNotFoundException("Book not found.");
    }

    @Override
    public void save(Book item) {
        library.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException {
            if(library.containsKey(id)){
                library.remove(id);
            } else throw new ItemNotFoundException("Book not found.");

    }
}
