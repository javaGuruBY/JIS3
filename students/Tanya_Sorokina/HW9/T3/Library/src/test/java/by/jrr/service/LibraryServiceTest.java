package by.jrr.service;

import by.jrr.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {

    Book testBook1;
    Book testBook2;
    Book testBook3;
    LibraryService libraryService;

    @BeforeEach
    void setUp(){
        testBook1 = new Book("Alice in Wonderland", "Lewis Carroll");
        testBook2 = new Book("The Adventures of Huckleberry Finn", "Mark Twain");
        testBook3 = new Book("Through the Looking-Glass", "Lewis Carroll");
        libraryService = new LibraryService();
        libraryService.getLibrary().clear();
    }

    @Test
    void addBookInLibrary() {
        boolean expected = true;
        libraryService.addBookInLibrary(testBook1);
        boolean actual = libraryService.getLibrary().contains(testBook1);
        assertEquals(expected, actual, "[Error] book not add");
    }

    @Test
    void deleteBookFromLibrary() {
        boolean expected = true;
        libraryService.addBookInLibrary(testBook1);
        libraryService.deleteBookFromLibrary(testBook1);
        boolean actual = libraryService.getLibrary().isEmpty();
        assertEquals(expected, actual, "[Error] book not delete");
    }

    @Test
    void findABookByTitle() {
        libraryService.addBookInLibrary(testBook2);
        Book expected = testBook2;
        Book actual = libraryService.findABookByTitle("The Adventures of Huckleberry Finn");
        assertEquals(expected, actual, "[Error] book not found");
    }

    @Test
    void returnAllBooksByAuthor() {
        libraryService.addBookInLibrary(testBook1);
        libraryService.addBookInLibrary(testBook2);
        libraryService.addBookInLibrary(testBook3);
        String expected = "All books by author Lewis Carroll : [Through the Looking-Glass, Alice in Wonderland]";
        String actual = libraryService.returnAllBooksByAuthor("Lewis Carroll");
        assertEquals(expected, actual, "[Error]");
    }
}