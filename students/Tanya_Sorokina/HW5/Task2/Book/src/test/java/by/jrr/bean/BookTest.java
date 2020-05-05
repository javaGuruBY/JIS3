package by.jrr.bean;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookTest {

    @Test
    void setAuthorTest() {
        Book bookTest1 = new Book();
        bookTest1.setAuthor("Джуан Роулинг");
        String expected = "Джуан Роулинг";
        String actual = bookTest1.getAuthor();
        assertEquals(expected,actual, "Error");
        System.out.println("setAuthorTest has passed");
    }

    @Test
    void setTitleTest() {
        Book bookTest2 = new Book();
        bookTest2.setTitle("Harry");
        String expected = "Harry";
        String actual = bookTest2.getTitle();
        assertEquals(expected,actual, "Error");
        System.out.println("setTitleTest has passed");
    }

    @Test
    void setNumberOfPagesTest() {
        Book bookTest3 = new Book();
        bookTest3.setNumberOfPages(500);
        int expected = 500;
        int actual = bookTest3.getNumberOfPages();
        assertEquals(expected, actual, "Error");
        System.out.println("setNumberOfPagesTest has passed");
    }
    @Test
    void equalsAndHashCodeTest() {
        Book HarryPotter1 = new Book();// equals and hashCode check name field value
        HarryPotter1.setAuthor("Rouling");
        Book HarryPotter2 = new Book();
        HarryPotter2.setAuthor("Rouling");
        assertTrue(HarryPotter1.equals(HarryPotter2) && HarryPotter2.equals(HarryPotter1));
        assertTrue(HarryPotter1.hashCode() == HarryPotter2.hashCode());
        System.out.println("equalsAndHashCodeTest has passed");
    }
}