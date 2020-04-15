package by.jrr.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void setAuthor() {
        Book book = new Book();
        String expectedResult = "Robert C. Martin";
        book.setAuthor("Robert C. Martin");
        String actualResult = book.getAuthor();
        assertEquals(expectedResult, actualResult, "should return Uncle Bob");
    }

    @Test
    void getAuthor() {
        Book book = new Book("Robert C. Martin");
        String expectedResult = "Robert C. Martin";
        String actualResult = book.getAuthor();
        assertEquals(expectedResult, actualResult, "should return Uncle Bob");

    }

    @Test
    void getTitle() {
        Book book = new Book();
        String expectedResult = "TDD";
        book.setTitle("TDD");
        String actualResult = book.getTitle();
        assertEquals(expectedResult, actualResult, "should return Uncle Bob");

    }

    @Test
    void setTitle() {
        Book book = new Book();
        String expectedResult = "TDD";
        book.setTitle("TDD");
        String actualResult = book.getTitle();
        assertEquals(expectedResult, actualResult, "should return TDD");

    }

    @Test
    void getNumberOfPages() {
        Book book = new Book(560);
        int expectedResult = 560;

        int actualResult = book.getNumberOfPages();
        assertEquals(expectedResult, actualResult, "should return Uncle Bob");

    }

    @Test
    void setNumberOfPages() {
        Book book = new Book(560);
        int expectedResult = 520;
        book.setNumberOfPages(520);
        int actualResult = book.getNumberOfPages();
        assertEquals(expectedResult, actualResult, "should return Uncle Bob");


    }
}