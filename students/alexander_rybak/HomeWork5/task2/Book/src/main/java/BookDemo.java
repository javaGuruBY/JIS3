import by.rybak.bean.Book;
import org.pmw.tinylog.Logger;

public class BookDemo {
    public static void main(String[] args) {
        Book book = new Book("J.K.Rowlling", "Harry Potter", 543);

        Logger.info(book);
        book.setAuthor("Alex");
        book.setBookName("Kontur");
        book.setCountOfPages(236);
        Logger.info(book);
    }
}
