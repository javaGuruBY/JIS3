package by.rybak;

import by.rybak.bean.Book;
import by.rybak.exceptions.ItemNotFoundException;
import by.rybak.service.BookRepositoryService;

public class BookRepositoryDemo {
    public static void main(String[] args) throws ItemNotFoundException {
        Book book = new Book("111", "222", 23,"333");
        BookRepositoryService service = new BookRepositoryService();

        service.save(book);
        System.out.println(service.findAll());
        System.out.println(service.findById("333"));
        System.out.println(service.findById("234"));
        service.delete("333");
        System.out.println(service.findAll());
    }
}
