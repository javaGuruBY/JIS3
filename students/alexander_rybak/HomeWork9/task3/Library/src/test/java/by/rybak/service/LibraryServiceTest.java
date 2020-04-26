package by.rybak.service;

import by.rybak.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    Book bookOne;
    Book bookTwo;

    LibraryService library;

    @BeforeEach
    void setUp() {
        bookOne = new Book("Leo Tolstoy", "War and Peace");
        bookTwo = new Book("Leo Tolstoy", "Anna Karenina");
        library = new LibraryService();
        library.addBookToTheLibrary(bookOne);
        library.addBookToTheLibrary(bookTwo);
    }

    @Test
    void addBookToTheLibrary() {
        Book expected = new Book("TTT", "YYY");
        library.addBookToTheLibrary(expected);
        Book actual = library.findByName("YYY");

        assertEquals(expected,actual);
    }

    @Test
    void deleteBookFromTheLibrary() {
        Book expected = null;
        library.deleteBookFromTheLibrary(bookOne);
        Book actual = library.findByName("War and Peace");

        assertEquals(expected, actual);
    }

    @Test
    void findByName() {
        Book expected = new Book("qwe","rty");
        library.addBookToTheLibrary(expected);
        Book actual = library.findByName("rty");

        assertEquals(expected, actual);
    }

    @Test
    void findByAuthor() {
        Book book = new Book("qwe","rty");
        ArrayList<Book> expected = new ArrayList<>();
        expected.add(book);
        library.addBookToTheLibrary(expected.get(0));
        ArrayList<Book> actual = library.findByAuthor("qwe");
        int counter = 0;
        for(Book el: expected){
            assertEquals(el, actual.get(counter++));
        }
    }
}