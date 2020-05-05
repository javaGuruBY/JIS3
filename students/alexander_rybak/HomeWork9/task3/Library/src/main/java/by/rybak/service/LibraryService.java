package by.rybak.service;

import by.rybak.bean.Book;

import java.util.*;

public class LibraryService{
    private Map<String, Book> map = new HashMap<>();

    public void addBookToTheLibrary(Book book){
        map.put(book.getBookName(), book);
    }

    public void deleteBookFromTheLibrary (Book book){
        map.remove(book.getBookName());
    }

    public Book findByName(String name){
        for(Map.Entry<String, Book> entry: map.entrySet()){
            if(entry.getKey().equals(name)){
                return entry.getValue();
            }
        }
        return null;
    }

    public ArrayList<Book> findByAuthor(String name){
        ArrayList<Book> books = new ArrayList<>();
        for(Map.Entry<String, Book> entry: map.entrySet()){
            if(entry.getValue().getAuthor().equals(name)){
                books.add(entry.getValue());
            }
        }
        return books;
    }
}
