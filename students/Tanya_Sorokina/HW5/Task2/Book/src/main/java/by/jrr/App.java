package by.jrr;
import by.jrr.App;
import by.jrr.bean.Book;
import by.jrr.service.BookService;

public class App {

    public static void main(String[] args) {
        Book book1 = new Book("Джуан Роулинг", "Гарии Поттер и фолософский камень", 465);
        Book book2 = new Book("Джуан Роулинг", "Гарии Поттер и фолософский камень", 465);
        Book book3 = new Book("Джуан Роулинг", "Гарри Поттер и узник Азкабана", 600);
        Book book4 = new Book("Джуан Роулинг", "Гарри Поттер и узник Азкабана", 600);
        System.out.println("book1 == book2" + (book1 == book2));
        System.out.println("book1 == book1" + (book1 == book1));
        System.out.println("book2 == book2" + (book2 == book2));
        System.out.println("book1 == book3" + (book1 == book3));
        System.out.println("book3.equals(book3)" + book3.equals(book3));
        System.out.println("book3.equals(book4)" + book3.equals(book4));
        System.out.println("book4.equals(book4)" + book4.equals(book4));
        System.out.println("book3.equals(book2)" + book3.equals(book2));
    }

}
