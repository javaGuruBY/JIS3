package by.bariloegor.service;

import by.bariloegor.bean.Book;
import by.bariloegor.repository.Library;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LibraryServiceTest {
    private LibraryService libraryService;

    @Before
    public void setUp() {
        libraryService = new LibraryService();
    }

    @Test
    public void addBookTest() {
        Book[] books = { new Book("Some Author", "Some Book"),
                new Book("Another Author", "Another Book")};
        String[] expected = {"{Some Author=[Some Book]}",
                "{Another Author=[Another Book], Some Author=[Some Book]}"};

        for (int i = 0; i < expected.length; i++){
           libraryService.addBook(books[i]);
            String actual = Library.libraryRepository.toString();
            assertEquals("Should add books.", expected[i], actual);
        }
    }

    @Test
    public void isAuthorAlreadyInLibraryTest() {
        boolean[] expected = {true, false};
        Book[] books = {new Book("Added Author", "Some book"),
                new Book("New Author", "Some book")};
        libraryService.addBook(books[0]);
        for(int i = 0; i < expected.length; i++){
            boolean actual = libraryService.isAuthorAlreadyInLibrary(books[i].getAuthor());
            assertEquals("Should reutrn is author already in library", expected[i], actual);
        }
    }

    @Test
    public void putBookToAuthorBooksTest() {
        Book book = new Book("Some Author", "Good Book");
        libraryService.addBook(book);
        Book[] books = { new Book("Some Author", "Some Book"),
                new Book("Some Author", "Another Book")};
        String[] expected = {"{Some Author=[Good Book, Some Book]}",
                "{Some Author=[Good Book, Some Book, Another Book]}"};

        for (int i = 0; i < expected.length; i++){
            libraryService.putBookToAuthorBooks(books[i]);
            String actual = Library.libraryRepository.toString();
            assertEquals("Should add books.", expected[i], actual);
        }
    }

    @Test
    public void putBookAndAuthorTest() {
        Book[] books = { new Book("Some Author", "Some Book"),
                new Book("Another Author", "Another Book")};
        String[] expected = {"{Some Author=[Some Book]}",
                "{Another Author=[Another Book], Some Author=[Some Book]}"};

        for (int i = 0; i < expected.length; i++){
            libraryService.putBookAndAuthor(books[i]);
            String actual = Library.libraryRepository.toString();
            assertEquals("Should add books.", expected[i], actual);
        }
    }

    @Test
    public void removeBookTest(){
        Book[] books = { new Book("Some Author", "Some Book"),
                new Book("Some Author", "Another Book"),
                new Book("Some Author", "Good Book")};
        for (Book book : books) {
            libraryService.addBook(book);
        }
        String[] expected = {"{Some Author=[Another Book, Good Book]}",
                "{Some Author=[Good Book]}"};
        for(int i = 0; i < expected.length; i++){
            libraryService.removeBook(books[i]);
            String actual = Library.libraryRepository.toString();
            assertEquals("Should remove book.", expected[i], actual);
        }
    }

    @Test
    public void booksOfAuthorTest(){
        Book[] books = { new Book("Some Author", "Some Book"),
                new Book("Some Author", "Another Book"),
                new Book("Some Author", "Good Book")};
        for (Book book : books) {
            libraryService.addBook(book);
        }

        List<String> expected = new ArrayList<>();
        expected.add("Some Book");
        expected.add("Another Book");
        expected.add("Good Book");

        List<String> actual = libraryService.booksOfAuthor("Some Author");
        assertEquals("Should return books of author", expected, actual);
    }

    @Test
    public void findBookTest() {
        Book[] books = {new Book("Some Author", "Some Book"),
                new Book("Some Author", "Another Book")};
        for (Book book : books) {
            libraryService.addBook(book);
        }

        Book[] expected = {new Book("Some Author", "Some Book"),
                new Book("Some Author", "Another Book")};
        String[] names = {"Some Book", "Another Book"};

        for(int i = 0; i < expected.length; i++){
            Book actual = libraryService.findBook(names[i]);
            assertEquals("Should find book.", expected[i], actual);
        }
    }

    @After
    public void tearDown(){
        Library.libraryRepository.clear();
    }
}