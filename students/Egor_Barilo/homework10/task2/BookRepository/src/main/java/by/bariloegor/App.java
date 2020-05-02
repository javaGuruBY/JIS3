package by.bariloegor;


import by.bariloegor.bean.Book;
import by.bariloegor.exceptions.ItemNotFoundException;
import by.bariloegor.service.BookRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) throws ItemNotFoundException {
        Logger log = LoggerFactory.getLogger(App.class);
        BookRepository bookRepository = new BookRepository();
        Book[] book = {new Book("first", "1984", "George Orwell", 324),
                new Book("second", "Some Book", "George Orwell", 122)};
        for (Book value : book) {
            bookRepository.save(value);
        }
        bookRepository.delete("second");
        String result = BookRepository.library.toString();
        log.info(result);
        Book foundBook = bookRepository.findById("first");
        result = foundBook.toString();
        log.info(result);
    }
}
