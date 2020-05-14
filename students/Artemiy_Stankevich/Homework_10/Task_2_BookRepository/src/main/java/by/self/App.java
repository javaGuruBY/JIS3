package by.self;

import by.self.Interface.Repository;
import by.self.bean.Book;
import by.self.exception.ItemNotFoundException;
import by.self.service.BookRepository;

public class App {
    public static void main(String[] args) throws ItemNotFoundException {
        Book book1 = new Book("1","Roman", "Pushkin", 150);
        Book book2 = new Book("2","Comedy", "Chexov", 300);
        Book book3 = new Book("3","Serial", "Artik", 199);
        Repository<Book> service = new BookRepository<>();
        service.save(book1);
        service.save(book2);
        service.save(book3);
        System.out.println("The book you were looking for: " + service.findById("1"));
        service.delete("3");
        service.findAll().forEach(System.out::println);
    }
}
