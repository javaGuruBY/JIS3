package by.jrr.library.service;

import by.jrr.library.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    Book bookTest;
    Book bookTest1;
    LibraryService libraryService;

    @BeforeEach
    void setUp() {
        bookTest = new Book("Rowling", "Harry Potter and the Chamber of Secrets");
        bookTest1 = new Book("Rowling", "Harry Potter and the Global of Fire");
        libraryService = new LibraryService();
        libraryService.getLibrary().clear();
    }

    @Test
    void addBookInLibraryTest() {
        boolean expected = true;
        libraryService.addBookInLibrary(bookTest);
        boolean actual = libraryService.getLibrary().contains(bookTest);
        assertEquals(expected, actual, "[Error] the library does not contain this book");
    }

    @Test
    void deleteBookFromLibraryTest() {
        boolean expected = true;
        libraryService.addBookInLibrary(bookTest);
        libraryService.deleteBookFromLibrary(bookTest);
        boolean actual = libraryService.getLibrary().isEmpty();
        assertEquals(expected, actual, "[Error] the book was not deleted");
    }

    @Test
    void findByBookInLibraryTest() {
        libraryService.addBookInLibrary(bookTest);
        Book expected = bookTest;
        Book actual = libraryService.findByBookInLibrary("Harry Potter and the Chamber of Secrets");
        assertEquals(expected, actual, "[Error] book not found");

    }

    @Test
    void returnAllBooksByAuthorTest() {
        libraryService.addBookInLibrary(bookTest);
        libraryService.addBookInLibrary(bookTest1);
        String expected = "All books Author: Rowling: [Harry Potter and the Global of Fire, " +
                "Harry Potter and the Chamber of Secrets]";
        String actual = libraryService.returnAllBooksByAuthor("Rowling");
        assertEquals(expected, actual, "[ERROR]");
    }
}