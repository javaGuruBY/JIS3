package service;

import by.abs.bean.Book;
import by.abs.bean.Library;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class LibraryService {

 public static final Map<String, Book> library = new HashMap<>();

    public void addBook(Book book){
        library.put(book.getTitle(), book);
    }

    public void deleteBook(Book book){
        library.remove(book.getTitle());
    }

    public Book findByTitle(String title){
        for (Map.Entry<String, Book> entry : library.entrySet()){
            if (entry.getKey().equals(title)){
                return entry.getValue();
            }
        }
        return null;
    }

    public ArrayList<Book> findByAuthor(String author){
        ArrayList<Book> shelf = new ArrayList<>();
        for (Map.Entry<String, Book> entry : library.entrySet()){
            if(entry.getValue().getAuthor().equals(author)){
                shelf.add(entry.getValue());
            }
        }
        return shelf;
    }
}
