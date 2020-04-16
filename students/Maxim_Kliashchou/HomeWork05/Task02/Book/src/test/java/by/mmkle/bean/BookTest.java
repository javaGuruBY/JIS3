package by.mmkle.bean;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book, testBook;

    @BeforeEach
    void setUp(){
        book = new Book("Peter", "Harry Potter", 678);
        testBook = new Book("Peter", "Harry Potter", 678);
    }

    @Test
    void getAuthor() {
        String testMessage = "Should return Peter";
        String expected = "Peter";
        String actual = book.getAuthor();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void setAuthor() {
        String testMessage = "Should return newPeter";
        String expected = "newPeter";
        book.setAuthor("newPeter");
        String actual = book.getAuthor();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void getName() {
        String testMessage = "Should return Harry Potter";
        String expected = "Harry Potter";
        String actual = book.getName();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void setName() {
        String testMessage = "Should return new Harry Potter";
        String expected = "new Harry Potter";
        book.setName("new Harry Potter");
        String actual = book.getName();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void getPageCount() {
        String testMessage = "Should return 678";
        int expected = 678;
        int actual = book.getPageCount();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void setPageCount() {
        String testMessage = "Should return 777";
        int expected = 777;
        book.setPageCount(777);
        int actual = book.getPageCount();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testEquals() {
        String testMessage = "Books should be equal";
        boolean expected = true;
        boolean actual = book.equals(testBook);
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testHashCode() {
        String testMessage = "Books hash should be same";
        int expected = book.hashCode();
        int actual = testBook.hashCode();
        assertEquals(expected, actual, testMessage);
    }

    @Test
    void testToString() {
        String testMessage = "Should return info string";
        String expected = "Book{author='Peter', name='Harry Potter', pageCount=678}";
        String actual = book.toString();
        assertEquals(expected, actual, testMessage);
    }
}