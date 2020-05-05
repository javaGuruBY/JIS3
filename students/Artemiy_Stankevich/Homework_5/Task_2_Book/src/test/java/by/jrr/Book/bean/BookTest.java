package by.jrr.Book.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class BookTest {

    @Test
    void testEqualsAndHashCode() {
        Book hobbit = new Book("Tolkien");  // equals and hashCode check name field value
        Book theLordOfTheRings = new Book("Tolkien");
        assertTrue(hobbit.equals(theLordOfTheRings) && theLordOfTheRings.equals(hobbit));
        assertTrue(hobbit.hashCode() == theLordOfTheRings.hashCode());
    }

    @Test
    void setAndGetAuthorTest() {
        String expected = "Tolkien";
        Book bookTest1 = new Book();
        bookTest1.setAuthor("Tolkien");
        String actual = bookTest1.getAuthor();
        assertEquals(expected, actual, "[Error}");
    }

    @Test
    void setAndGetBookNameTest() {
        String expected = "hobbit";
        Book bookTest2 = new Book();
        bookTest2.setBookName("hobbit");
        String actual = bookTest2.getBookName();
        assertEquals(expected, actual, "[Error}");
    }

    @Test
    void setAndGetNumPageTest() {
        int expected = 1137;
        Book bookTest3 = new Book();
        bookTest3.setNumPage((short) 1137);
        short actual = bookTest3.getNumPage();
        assertEquals(expected, actual, "[Error}");
    }
}