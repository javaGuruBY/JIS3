package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    private Book book;
    @BeforeEach
    void setUp() {
        book = new Book();
    }

    @Test
    void id() {
        String testMessage = "Should set and get id";
        book.setId("1");
        String expected = "1";
        String actual = book.getId();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void name() {
        String testMessage = "Should set and get name";
        book.setName("name");
        String expected = "name";
        String actual = book.getName();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void author() {
        String testMessage = "Should set and get author";
        book.setAuthor("author");
        String expected = "author";
        String actual = book.getAuthor();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void pagesCount() {
        String testMessage = "Should set and get pages count";
        book.setPagesCount(155);
        int expected = 155;
        int actual = book.getPagesCount();
        assertEquals(expected, actual, testMessage);

    }

    @Test
    void testEquals() {
        String testMessage = "Should return true if objects are equal";
        book = new Book("1", "name", "author", 15);
        Object[] books = {
                new Book("1", "name", "author", 15),
                new Book("2", "name", "author", 15),
                new Book("1", "nam", "author", 15),
                new Book("1", "name", "autho", 15),
                new Book("1", "name", "author", 13),
                new Object(),
                book,
                null
        };
        boolean[] expected = {true, false, false, false, false, false, true, false};
        for (int i = 0; i < expected.length; i++){
            boolean actual = book.equals(books[i]);
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void testHashCode() {
        String testMessage = "Should return true if objects are equal";
        book = new Book("1", "name", "author", 15);
        Object[] books = {
                new Book("1", "name", "author", 15),
                new Book("2", "name", "author", 15),
                new Book("1", "nam", "author", 15),
                new Book("1", "name", "autho", 15),
                new Book("1", "name", "author", 13),
                new Object(),
                book
        };
        boolean[] expected = {true, false, false, false, false, false, true};
        for (int i = 0; i < expected.length; i++){
            boolean actual = book.hashCode() == books[i].hashCode();
            assertEquals(expected[i], actual, testMessage);
        }
    }
}