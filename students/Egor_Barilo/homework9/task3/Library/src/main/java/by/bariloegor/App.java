package by.bariloegor;

import by.bariloegor.bean.Book;
import by.bariloegor.service.LibraryService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        Logger log = LoggerFactory.getLogger(App.class);
        LibraryService libraryService = new LibraryService();
        String someAuthor = "Some Author";
        Book[] books = { new Book(someAuthor,  "Some Book"),
                new Book(someAuthor, "Another Book"),
                new Book(someAuthor, "Good Book"),
                new Book("Next Author", "Bad Book")};
        for(Book book : books){
            libraryService.addBook(book);
        }
        libraryService.removeBook(books[2]);
        String result = libraryService.booksOfAuthor(someAuthor).toString();
        log.info(result);
        result = libraryService.findBook("Some Book").toString();
        log.info(result);
    }
}
