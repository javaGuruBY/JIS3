package repository;

import by.abs.bean.Book;
import exceptions.ItemNotFoundException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {
Repository repository;
    @BeforeEach
    void setUp() {
        repository = new BookRepository();
    }

    @Test
    void mustFindAll() {
        Book book = new Book("1", "something", "someone", 111);
        List<Book> expected = Arrays.asList(new Book("1", "something",
                "someone", 111));
        repository.save(book);
        List<Book> actual = repository.findAll();
        assertEquals(expected, actual);

    }


    @Test
    void mustFindById() throws ItemNotFoundException{
        Book book = new Book("1", "something", "someone1", 111);
        Book expected = new Book("1", "something", "someone1", 111);
        repository.save(book);
        Book actual = (Book) repository.findById(book.getId());
        assertEquals(expected, actual);
    }


    @Test
    void mustDelete() throws ItemNotFoundException {
        Book book = new Book("1", "something", "someone", 111);
        List<Book> expected = new ArrayList<>();
        repository.save(book);
        repository.delete(book.getId());
        List<Book> actual = repository.findAll();
        assertEquals(expected, actual);
    }

}