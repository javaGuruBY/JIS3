package by.bariloegor.bean;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void getIdTest() {
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        String[] expected = {"first", "second"};
        for(int i = 0; i < expected.length; i++){
            String actual = book[i].getId();
            assertEquals("Should return book id.", expected[i], actual);
        }
    }

    @Test
    public void setIdTest() {
        Book[] book = {new Book("www", "1984", "George Orwell", 324),
                new Book("eee", "Some Book", "George Orwell", 122)};
        String[] ids = {"Some Author", "Another Author"};
        String[] expected = {"Some Author", "Another Author"};
        for(int i = 0; i < expected.length; i++){
            book[i].setId(ids[i]);
            String actual = book[i].getId();
            assertEquals("Should set book id.", expected[i], actual);
        }
    }

    @Test
    public void getNameTest() {
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        String[] expected = {"1984", "Some Book"};
        for(int i = 0; i < expected.length; i++){
            String actual = book[i].getName();
            assertEquals("Should return book name.", expected[i], actual);
        }
    }

    @Test
    public void setNameTest() {
        Book[] book = {new Book("first", "QQQ", "George Orwell", 324),
                new Book("second", "WWW", "George Orwell", 122)};
        String[] names = {"1984", "Some Book"};
        String[] expected = {"1984", "Some Book"};
        for(int i = 0; i < expected.length; i++){
            book[i].setName(names[i]);
            String actual = book[i].getName();
            assertEquals("Should set book name.", expected[i], actual);
        }
    }

    @Test
    public void getAuthorTest() {
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "Some author", 122)};
        String[] expected = {"George Orwell", "Some author"};
        for(int i = 0; i < expected.length; i++){
            String actual = book[i].getAuthor();
            assertEquals("Should return author of book.", expected[i], actual);
        }
    }

    @Test
    public void setAuthorTest() {
        Book[] book = {new Book("first", "1984", "QQQ", 324),
                new Book("second", "Some Book", "WWW", 122)};
        String[] authors = {"Some Author", "Another Author"};
        String[] expected = {"Some Author", "Another Author"};
        for(int i = 0; i < expected.length; i++){
            book[i].setAuthor(authors[i]);
            String actual = book[i].getAuthor();
            assertEquals("Should set author of book.", expected[i], actual);
        }
    }

    @Test
    public void getPagesCountTest() {
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "Some author", 122)};
        int[] expected = {324, 122};
        for(int i = 0; i < expected.length; i++){
            int actual = book[i].getPagesCount();
            assertEquals("Should return book pages count.", expected[i], actual);
        }
    }

    @Test
    public void setPagesCountTest() {
        Book[] book = {new Book("www", "1984", "George Orwell", 0),
                new Book("eee", "Some Book", "George Orwell", 0)};
        int[] pagesCounters = {324, 122};
        int[] expected = {324, 122};
        for(int i = 0; i < expected.length; i++){
            book[i].setPagesCount(pagesCounters[i]);
            int actual = book[i].getPagesCount();
            assertEquals("Should set book pages count.", expected[i], actual);
        }
    }

    @Test
    public void testToString() {
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        String[] expected = { "Book{id='first', name='1984', author='George Orwell', pagesCount=324}",
                "Book{id='second', name='Some Book', author='George Orwell', pagesCount=122}"};
        for(int i = 0; i < expected.length; i++){
            String actual = book[i].toString();
            assertEquals("Should return book to string.", expected[i], actual);
        }
    }
}