package by.rybak.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;

    @BeforeEach
    void setUp() {
        book = new Book("111", "222", 123, "903");
    }

    @Test
    void getId() {
        String expected = "903";
        String actual = book.getId();

        assertEquals(expected, actual, "Should return right books's id...");
    }

    @Test
    void setId() {
        book.setId("000");
        String expected = "000";
        String actual = book.getId();

        assertEquals(expected, actual, "Should right set books's id...");
    }

    @Test
    void getName() {
        String expected = "111";
        String actual = book.getName();

        assertEquals(expected, actual, "Should return right books's name...");
    }

    @Test
    void setName() {
        book.setName("123");
        String expected = "123";
        String actual = book.getName();

        assertEquals(expected, actual, "Should right set books's name...");
    }

    @Test
    void getAuthor() {
        String expected = "222";
        String actual = book.getAuthor();

        assertEquals(expected, actual, "Should return right books's author...");
    }

    @Test
    void setAuthor() {
        book.setAuthor("777");
        String expected = "777";
        String actual = book.getAuthor();

        assertEquals(expected, actual, "Should right set books's author...");
    }

    @Test
    void getPagesCount() {
        int expected = 123;
        int actual = book.getPagesCount();

        assertEquals(expected, actual, "Should return right books's count of pages...");
    }

    @Test
    void setPagesCount() {
        book.setPagesCount(678);
        int expected = 678;
        int actual = book.getPagesCount();

        assertEquals(expected, actual, "Should right set books's count of pages...");
    }

    @Test
    void testEquals() {
        Book book1 = new Book("111", "222", 123, "903");
        Book book2 = new Book();

        boolean actual = book.equals(book);
        boolean actual1 = book.equals(book1);
        boolean actual2 = book.equals(book2);

        assertTrue(actual);
        assertTrue(actual1);
        assertFalse(actual2);
    }

    @Test
    void testToString() {
        String expected = "Book{id='903', name='111', author='222', pagesCount=123}";
        String actual = book.toString();

        assertEquals(expected, actual);
    }
}