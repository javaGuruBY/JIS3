package repository;

import by.abs.bean.Book;
import exceptions.ItemNotFoundException;

import java.util.*;

public class BookRepository implements Repository<Book> {

    private Map<String, Book> library = new HashMap<>();

    @Override
    public List<Book> findAll() {
        List<Book> list = new ArrayList<>();
        for (Map.Entry<String, Book> entry : library.entrySet()){
            list.add(entry.getValue());
        }
        return list;
    }


    @Override
    public Book findById(String id) throws ItemNotFoundException {
            if (bookIsInLibrary(id)){
                return library.get(id);
            } else {
                throw new ItemNotFoundException("Book " + id + " is not available");
            }
        }

    @Override
    public void save(Book item) {
        library.put(item.getId(), item);
    }

    @Override
    public void delete(String id) throws ItemNotFoundException  {
        if (bookIsInLibrary(id)){
        library.remove(id);
        } else {
            throw new ItemNotFoundException("Book " + id + " is not available");
        }
    }

    public boolean bookIsInLibrary(String id){
        return library.containsKey(id);
    }
    }



