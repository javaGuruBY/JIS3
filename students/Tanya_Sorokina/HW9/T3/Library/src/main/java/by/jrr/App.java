package by.jrr;
import by.jrr.bean.Book;
import by.jrr.service.LibraryService;

public class App {
    public static void main(String[] args) {
        LibraryService libraryService = new LibraryService();

        Book book1 = new Book("Alice in Wonderland", "Lewis Carroll");
        Book book2 = new Book("Through the Looking-Glass", "Lewis Carroll");
        Book book3 = new Book("Do not open", "Sharlotta Haberzak");
        Book book4 = new Book("Genzel and Grettel", "Grimms brothers");
        Book book5 = new Book("Bible", "Sent people");
        Book book6 = new Book("Rumpelsthiltskin", "Grimms brothers");
        libraryService.addBookInLibrary(book1);
        libraryService.addBookInLibrary(book2);
        libraryService.addBookInLibrary(book3);
        libraryService.addBookInLibrary(book4);
        libraryService.addBookInLibrary(book5);
        libraryService.addBookInLibrary(book6);
        System.out.println(libraryService.findABookByTitle("Bible"));
        libraryService.deleteBookFromLibrary(book3);
        System.out.println("book3 was delete");
        System.out.println("find a book3 - Do not open : " + libraryService.findABookByTitle("Do not open"));
        System.out.println(libraryService.returnAllBooksByAuthor("Grimms brothers"));


    }
}
