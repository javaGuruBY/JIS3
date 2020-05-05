package service;

import by.abs.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

LibraryService service;
Book book1;
Book book2;

    @BeforeEach
    void setUp() {
        service = new LibraryService();
       Book book1 = new Book("something", "somebody");
        Book book2 = new Book("something1", "somebody1");
        service.addBook(book1);
        service.addBook(book2);
    }

    @Test
    void mustAddBook() {
        Book expected = new Book("something", "somebody");
        service.addBook(expected);
        Book actual = service.findByTitle("something");
        assertEquals(expected,actual);
    }

    @Test
    void mustDeleteBook() {
        Book expected = null;
        Book book1 = new Book("something", "somebody");
        service.deleteBook(book1);
        Book actual = service.findByTitle("something");
        assertEquals(expected, actual);
    }



    @Test
    void mustFindByTitle() {
        Book expected = new Book("something", "somebody");
        service.addBook(expected);
        Book actual = service.findByTitle("something");
        assertEquals(expected, actual);

    }

    @Test
    void mustFindByAuthor() {
        Book book = new Book("something", "somebody");
        ArrayList<Book> expected = new ArrayList<>();
        expected.add(book);
        service.addBook(expected.get(0));
        ArrayList<Book> actual = service.findByAuthor("somebody");
        int i = 0;
        for(Book b: expected){
            assertEquals(b, actual.get(i++));
        }
}}