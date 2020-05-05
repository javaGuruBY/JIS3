package by.rybak.service;

import by.rybak.bean.Book;
import by.rybak.exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryServiceTest {
    Book book;
    BookRepositoryService service;

    @BeforeEach
    void setUp() {
        book = new Book("111", "222", 23,"333");
        service = new BookRepositoryService();
    }

    @Test
    void findAll() {
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        service.save(book);
        List<Book> actual = service.findAll();
        boolean result = expected.equals(actual);

        assertTrue(result);
    }

    @Test
    void findById() throws ItemNotFoundException {
        service.save(book);
        Book expected = book;
        Book actual = service.findById("333");

        assertEquals(expected, actual);
    }

    @Test
    void save() {
        service.save(book);
        List<Book> expected = new ArrayList<>();
        expected.add(book);
        List<Book> actual = service.findAll();
        boolean result = expected.equals(actual);

        assertTrue(result);
    }

    @Test
    void delete() throws ItemNotFoundException {
        service.save(book);
        service.delete("333");
        List<Book> expected = new ArrayList<>();
        List<Book> actual = service.findAll();
        boolean result = expected.equals(actual);

        assertTrue(result);
    }
}