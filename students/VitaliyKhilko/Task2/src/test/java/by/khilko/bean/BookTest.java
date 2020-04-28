package by.khilko.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void getAuthor() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should return author book";
        String expected = "Vitaliy Khilko";
        String actual = book.getAuthor();

        assertEquals(expected, actual, message);
    }

    @Test
    void setAuthor() {
        Book book = new Book();
        book.setAuthor("Vitaliy Khilko");

        String message = "Should set and return author book";
        String expected = "Vitaliy Khilko";
        String actual = book.getAuthor();

        assertEquals(expected, actual, message);
    }

    @Test
    void getTitleBook() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should return titleBook book";
        String expected = "My Java Lessons";
        String actual = book.getTitleBook();

        assertEquals(expected, actual, message);
    }

    @Test
    void setTitleBook() {
        Book book = new Book();
        book.setTitleBook("My Java Lessons");

        String message = "Should set and return titleBook book";
        String expected = "My Java Lessons";
        String actual = book.getTitleBook();

        assertEquals(expected, actual, message);
    }

    @Test
    void getPage() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should return page book";
        int expected = 600;
        int actual = book.getPage();

        assertEquals(expected, actual, message);
    }

    @Test
    void setPage() {
        Book book = new Book();
        book.setPage(500);

        String message = "Should set and return counter page of book";
        int expected = 500;
        int actual = book.getPage();

        assertEquals(expected, actual, message);
    }

    @Test
    void testEquals() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);
        Book book2 = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should return equals books";
        boolean expected = true;
        boolean actual = book.equals(book2);

        assertEquals(expected, actual, message);
    }

    @Test
    void testHashCode() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);
        Book book2 = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should be hashcode books same";
        int expected = book.hashCode();
        int actual = book2.hashCode();

        assertEquals(expected, actual, message);
    }

    @Test
    void testToString() {
        Book book = new Book("Vitaliy Khilko", "My Java Lessons", 600);

        String message = "Should return info string";
        String expected = "Book{author='Vitaliy Khilko', titleBook='My Java Lessons', page=600}";
        String actual = book.toString();
        assertEquals(expected, actual, message);
    }
}