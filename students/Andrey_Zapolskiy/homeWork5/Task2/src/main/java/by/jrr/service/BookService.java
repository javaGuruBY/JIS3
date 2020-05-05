package by.jrr.service;

import by.jrr.bean.Book;
import org.pmw.tinylog.Logger;

public class BookService {
    public static void main(String[] args) {
        Book book = new Book();
        book.setAuthor("someAuthor");
        book.setNumberOfPages(20);
        book.setTitle("someTitle");
        System.out.println(book);
        System.out.println(book.getAuthor());
        System.out.println(book.getNumberOfPages());
        System.out.println(book.getTitle());
        Logger.info("book.getNumberOfPages()");
        Logger.info(book.getNumberOfPages());
        Logger.info("book.getTitle()");
        Logger.info(book.getTitle());
        Logger.info("book.getAuthor()");
        Logger.info(book.getAuthor());
        Logger.info("book");
        Logger.info(book);


    }

}
