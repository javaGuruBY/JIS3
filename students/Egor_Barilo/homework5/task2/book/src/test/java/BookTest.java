import static org.junit.jupiter.api.Assertions.*;
import by.bariloegor.bean.Book;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BookTest {
    private Book book;
    @BeforeEach
    void setUp(){
        book = new Book("George Orwell", "1984", 328);
    }

    @Test
    void setNameTest(){
        String expected = "Keep the Aspidistra Flying";
        book.setName("Keep the Aspidistra Flying");
        String actual = book.getName();
        assertEquals(expected, actual, "Name should be Keep the Aspidistra Flying.");
    }

    @Test
    void getNameTest(){
        String expected = "1984";
        String actual = book.getName();
        assertEquals(expected, actual, "Received name should be 1984.");
    }

    @Test
    void setAuthorTest(){
        String expected = "Aldous Huxley";
        book.setAuthor("Aldous Huxley");
        String actual = book.getAuthor();
        assertEquals(expected, actual, "Author should be Aldous Huxley.");
    }

    @Test
    void getAuthorTest(){
        String expected = "George Orwell";
        String actual = book.getAuthor();
        assertEquals(expected, actual, "Received author should be George Orwell.");
    }

    @Test
    void setNumberOfPages(){
        int expected = 50;
        book.setNumberOfPages(50);
        int actual = book.getNumberOfPages();
        assertEquals(expected, actual, "Number of pages should be 50.");
    }

    @Test
    void getNumberOfPages(){
        int expected = 328;
        int actual = book.getNumberOfPages();
        assertEquals(expected, actual, "Received number of pages should be 328.");
    }

    @Test
    void toStringTest(){
        String expected = "Book{author='George Orwell', name='1984', numberOfPages=328}";
        String actual = book.toString();
        assertEquals(expected, actual, "Strings should be same.");
    }

    @Test
    void equalsTest(){
        boolean expected = true;
        Book newBook = new Book("George Orwell", "1984", 328);
        boolean actual = book.equals(newBook);
        assertEquals(expected, actual, "Books should equal.");
    }

    @Test
    void hashCodeTest(){
        int expected = book.hashCode();
        Book newBook = book;
        int actual = newBook.hashCode();
        assertEquals(expected, actual, "Hashcodes should be same.");
    }
}
