package by.jrr.service;
//Класс Library должен выполнять роль хранилища книг в виде списка и выполнять следующие действия:
//
//        Добавить книгу в библиотеку
//        Удалить книгу из библиотеки
//        Найти одну книгу по названию
//        Вернуть все книги по автору
//
//        При создании объекта, список книг должен быть пустым, а не null.

import by.jrr.bean.Book;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LibraryService {

    private final Set<Book> library = new HashSet<>();

    public Set<Book> getLibrary() {
        return library;
    }

    public void addBookInLibrary (Book book){
        library.add(book);
    }

    public void  deleteBookFromLibrary (Book book) {
        library.remove(book);
    }

    public Book findABookByTitle (String bookTittle) {
        for (Book books:library) {
            if (books.getBookTittle().equals(bookTittle)) {
                return books;
            }
        }
        return null;
    }

    public String returnAllBooksByAuthor(String authors){
        List<String> allBooksByAuthor = new ArrayList<>();
        for (Book author:library) {
            if (author.getBookAuthor().equals(authors)) {
                allBooksByAuthor.add(author.getBookTittle());
            }
        }
        String result = "All books by author " + authors + " : " + allBooksByAuthor;
        return result;
    }


}
