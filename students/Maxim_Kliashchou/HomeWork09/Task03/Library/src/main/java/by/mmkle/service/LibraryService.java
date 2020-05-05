package by.mmkle.service;

import by.mmkle.bean.Book;
import by.mmkle.exceptions.NoSuchAuthorException;
import by.mmkle.exceptions.NoSuchBookException;
import by.mmkle.repository.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryService {
    public void add(Book book){
        if (isAuthorInLibrary(book.getAuthor())){
            addBookName(book);
        } else {
            Library.shelve.put(book.getAuthor(), new ArrayList<String>());
            addBookName(book);
        }
    }

    public void remove(Book book){
        if (isAuthorInLibrary(book.getAuthor())) {
            List<String> authorBooks = Library.shelve.get(book.getAuthor());
            authorBooks.remove(book.getName());
            Library.shelve.put(book.getAuthor(), authorBooks);
        } else {
            throw new NoSuchAuthorException();
        }
    }

    public Book find(String bookName){
        for (Map.Entry<String, List<String>> entry : Library.shelve.entrySet()){
            if (entry.getValue().contains(bookName)){
               return new Book(entry.getKey(), bookName);
            }
        }
        throw new NoSuchBookException();
    }

    public void printAuthorBooks(String author){
        if (isAuthorInLibrary(author)) {
            System.out.println(author + " = " + Library.shelve.get(author));
        } else {
            throw new NoSuchAuthorException();
        }
    }

    private void addBookName(Book book){
        Library.shelve.get(book.getAuthor()).add(book.getName());
    }

    private boolean isAuthorInLibrary(String author){
        return Library.shelve.containsKey(author);
    }
}
