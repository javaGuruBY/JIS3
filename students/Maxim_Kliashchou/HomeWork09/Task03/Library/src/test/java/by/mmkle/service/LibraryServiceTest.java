package by.mmkle.service;

import by.mmkle.bean.Book;
import by.mmkle.repository.Library;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryServiceTest {
    private LibraryService service;

    @BeforeEach
    void setUp(){
        service = new LibraryService();
        Library.shelve.clear();
    }
    @Test
    void add() {
        String testMessage = "Should add book in library";
        Book[] books = {
                new Book("author1", "book1"),
                new Book("author1", "book2"),
        };

        String[] expected = {
                "{author1=[book1]}",
                "{author1=[book1, book2]}"
        };

        for (int i = 0; i < expected.length; i++){
            service.add(books[i]);
            String actual = Library.shelve.toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void remove() {
        String testMessage = "Should remove book from library";
        Book[] books = {
                new Book("author1", "book1"),
                new Book("author1", "book2"),
        };

        Book[] booksForRemove = {
                new Book("author1", "book1"),
                new Book("author1", "book2"),
        };

        for(Book book : books){
            service.add(book);
        }

        String[] expected = {
                "{author1=[book2]}",
                "{author1=[]}"
        };

        for (int i = 0; i < expected.length; i++){
            service.remove(booksForRemove[i]);
            String actual = Library.shelve.toString();
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void find() {
        String testMessage = "Should find book in library";
        Book[] books = {
                new Book("author1", "book1"),
                new Book("author2", "book2"),
        };

        Book[] booksForFind = {
                new Book("author1", "book1"),
                new Book("author2", "book2"),
        };

        for(Book book : books){
            service.add(book);
        }

        Book[] expected = {
                new Book("author1", "book1"),
                new Book("author2", "book2")
        };

        for (int i = 0; i < expected.length; i++){

            Book actual = service.find(booksForFind[i].getName());
            assertEquals(expected[i], actual, testMessage);
        }
    }

    @Test
    void printAuthorBooks() {
    }
}