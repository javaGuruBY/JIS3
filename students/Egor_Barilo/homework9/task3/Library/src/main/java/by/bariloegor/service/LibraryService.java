package by.bariloegor.service;

import by.bariloegor.bean.Book;
import by.bariloegor.repository.Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LibraryService {
    public void addBook(Book book){
        if(isAuthorAlreadyInLibrary(book.getAuthor())){
            putBookToAuthorBooks(book);
        } else {
            putBookAndAuthor(book);
        }
    }

    public boolean isAuthorAlreadyInLibrary(String author){
        return Library.libraryRepository.containsKey(author);
    }

    public void putBookToAuthorBooks(Book book){
        List<String> authorBooks = Library.libraryRepository.get(book.getAuthor());
        authorBooks.add(book.getName());
        Library.libraryRepository.put(book.getAuthor(), authorBooks);
    }

    public void putBookAndAuthor(Book book){
        List<String> authorBooks = new ArrayList<>();
        authorBooks.add(book.getName());
        Library.libraryRepository.put(book.getAuthor(),authorBooks);
    }

    public void removeBook(Book book){
        List<String> books = Library.libraryRepository.get(book.getAuthor());
        books.remove(book.getName());
        Library.libraryRepository.put(book.getAuthor(), books);
    }

    public Book findBook(String name){
        Book book = new Book("", "");
        for(Map.Entry<String, List<String>> entry : Library.libraryRepository.entrySet()){
            if(entry.getValue().contains(name)){
                book = new Book(entry.getKey(), name);
            }
        }
        return book;
    }

    public List<String> booksOfAuthor(String author){
        return Library.libraryRepository.get(author);
    }
}
