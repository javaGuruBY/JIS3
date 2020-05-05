package by.bariloegor.service;

import by.bariloegor.bean.Book;
import by.bariloegor.exceptions.ItemNotFoundException;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class BookRepositoryTest {
    BookRepository bookRepository;

    @Before
    public void setUp(){
        bookRepository = new BookRepository();
    }

    @Test
    public void findAllTest() {
        List<Book> expected = Arrays.asList(new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122));

        BookRepository.library.put("first",
                new Book("first", "1984", "George Orwell", 324));
        BookRepository.library.put("second",
                new Book("second", "Some Book", "George Orwell", 122));

        List<Book> actual = bookRepository.findAll();
        assertEquals("Should find all books.", expected, actual);
    }

    @Test
    public void findByIdTest() throws ItemNotFoundException {
        Book[] expected = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        String[] ids = {"first", "second"};

        BookRepository.library.put("first",
                new Book("first", "1984", "George Orwell", 324));
        BookRepository.library.put("second",
                new Book("second", "Some Book", "George Orwell", 122));

        for(int i = 0; i < expected.length; i++){
            Book actual = bookRepository.findById(ids[i]);
            assertEquals("Should find book by id.", expected[i], actual);
        }
    }

    @Test(expected = ItemNotFoundException.class)
    public void findByIdExceptionTest() throws ItemNotFoundException {
        bookRepository.findById("123");
    }

    @Test
    public void saveTest() {
        Book[] books = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        String[] ids = {"first", "second"};
        for(int i = 0; i < books.length; i++){
            bookRepository.save(books[i]);
            boolean actual = BookRepository.library.containsKey(ids[i]);
            assertTrue("Should save book.", actual);
        }
    }

    @Test
    public void deleteTest() throws ItemNotFoundException {
        BookRepository.library.put("first",
                new Book("first", "1984", "George Orwell", 324));
        BookRepository.library.put("second",
                new Book("second", "Some Book", "George Orwell", 122));
        String[] ids = {"first", "second"};
        for (String id : ids) {
            bookRepository.delete(id);
            boolean actual = BookRepository.library.containsKey(id);
            assertFalse("Should delete book.", actual);
        }
    }

    @Test(expected = ItemNotFoundException.class)
    public void deleteExceptionTest() throws ItemNotFoundException {
        bookRepository.delete("qweq");
    }

    @After
    public void tearDown(){
        BookRepository.library.clear();
    }
}