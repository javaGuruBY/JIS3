package by.rybak;

import by.rybak.bean.Book;
import by.rybak.service.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LibraryDemo {
    
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(LibraryDemo.class);
        
        Book bookOne = new Book("Leo Tolstoy", "War and Peace");
        Book bookTwo = new Book("Leo Tolstoy", "Anna Karenina");

        LibraryService library = new LibraryService();

        library.addBookToTheLibrary(bookOne);
        library.addBookToTheLibrary(bookTwo);

        log.info(String.valueOf(library.findByName("War and Peace")));
        log.info(String.valueOf(library.findByAuthor("Leo Tolstoy")));

        library.deleteBookFromTheLibrary(bookOne);
        log.info(String.valueOf(library.findByAuthor("Leo Tolstoy")));
    }
}
