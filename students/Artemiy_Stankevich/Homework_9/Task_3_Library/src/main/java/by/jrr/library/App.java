package by.jrr.library;

import by.jrr.library.bean.Book;
import by.jrr.library.service.LibraryService;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Tolkien", "The Lord of the Rings");
        Book book2 = new Book("Sapkovskiy", "The Witcher");
        Book book3 = new Book("Artemiy Stankevich", "Book of my Life");
        Book book4 = new Book("Tolkien", "Stalker 3");
        LibraryService libraryService = new LibraryService();
        libraryService.addBookInLibrary(book1);
        libraryService.addBookInLibrary(book2);
        libraryService.addBookInLibrary(book3);
        libraryService.addBookInLibrary(book4);
        System.out.println(libraryService.findByBookInLibrary("The Lord of the Rings"));
        System.out.println(libraryService.returnAllBooksByAuthor("Tolkien"));


    }
}
