package by.mmkle.repository;

import by.mmkle.bean.Book;
import by.mmkle.exception.ItemNotFoundException;
import by.mmkle.interfaces.Repository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BookRepositoryTest {
    private Repository repository;
    @BeforeEach
    void setUp() {
        repository = new BookRepository();
    }

    @Test
    void findById() throws ItemNotFoundException{
        String testMessage = "Should add and print book";
        Book book = new Book("1", "name1", "author1", 100);
        Book expected = new Book("1", "name1", "author1", 100);
        repository.save(book);
        Book actual = (Book) repository.findById(book.getId());
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void saveAndFindAll() {
        String testMessage = "Should add and print book";
        Book book = new Book("1", "name1", "author1", 100);
        List<Book> expected = Arrays.asList(
                new Book("1", "name1", "author1", 100)
        );
        repository.save(book);
        List<Book> actual = repository.findAll();
        assertEquals(expected, actual, testMessage);

    }

    @Test
    void delete() throws ItemNotFoundException{
        String testMessage = "Should delete book";
        Book book = new Book("1", "name1", "author1", 100);
        List<Book> expected = new ArrayList<>();
        repository.save(book);
        repository.delete(book.getId());
        List<Book> actual = repository.findAll();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void deleteException() {
        String testMessage = "Shouldn't delete book";
        Book book = new Book("1", "name1", "author1", 100);
        repository.save(book);
        Exception exception = Assertions.assertThrows(ItemNotFoundException.class, () -> repository.delete("2"));
        assertTrue(exception.getMessage().contains("2 not found"));
    }

    @Test
    void findByIdException() {
        String testMessage = "Shouldn't find book";
        Book book = new Book("1", "name1", "author1", 100);
        repository.save(book);
        Exception exception = Assertions.assertThrows(ItemNotFoundException.class, () -> repository.findById("2"));
        assertTrue(exception.getMessage().contains("2 not found"));
    }


}