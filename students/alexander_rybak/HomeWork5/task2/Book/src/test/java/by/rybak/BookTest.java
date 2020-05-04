package src.test.java.by.rybak;

import by.rybak.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {
    Book book;

    @BeforeEach
    public void initialization(){
        book = new Book("J.K.Rowlling", "Harry Potter", 543);
    }

    @Test
    void getAuthor() {
        String expected = "J.K.Rowlling";
        String actual = book.getAuthor();

        assertEquals(expected, actual,"Should return right author name");
    }

    @Test
    void setAuthor() {
        book.setAuthor("Alex");
        String expected = "Alex";
        String actual = book.getAuthor();

        assertEquals(expected, actual,"Should set right author name");
    }

    @Test
    void getBookName() {
        String expected = "Harry Potter";
        String actual = book.getBookName();

        assertEquals(expected, actual,"Should return right book name");
    }

    @Test
    void setBookName() {
        book.setBookName("konstructor");
        String expected = "konstructor";
        String actual = book.getBookName();

        assertEquals(expected, actual,"Should set right book name");
    }

    @Test
    void getCountOfPages() {
        int expected = 543;
        int actual = book.getCountOfPages();

        assertEquals(expected, actual, "Should return right count of pages!");
    }

    @Test
    void setCountOfPages() {
        book.setCountOfPages(111);
        int expected = 111;
        int actual = book.getCountOfPages();

        assertEquals(expected, actual, "Should set right count of pages!");
    }

    @Test
    void testEquals() {
        Book book1 = new Book("J.K.Rowlling", "Harry Potter", 543);
        Boolean expected = true;
        Boolean actual = book.equals(book1);

        assertEquals(expected, actual, "Should right equals 2 objects!");
    }

    @Test
    void testEquals1() {
        Boolean expected = true;
        Boolean actual = book.equals(book);

        assertEquals(expected, actual, "Should right equals 1 objects!");
    }

    @Test
    void Book() {
        Book book1 = new Book();
        int expected = 0;
        int actual = book1.getCountOfPages();

        assertEquals(expected, actual, "Should right equals 1 objects!");
    }

    @Test
    void testToString() {
        String expected = "Book{author='J.K.Rowlling', bookName='Harry Potter', countOfPages=543}";
        String actual = book.toString();
        
        assertEquals(expected, actual, "Should return right information about objects!");
    }
}