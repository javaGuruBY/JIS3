package by.jrr.bean;
//        Необходимо разработать систему учета книг. Нужно создать два класса: книга Book и библиотека Library.
//
//       Класс Book должен состоять из автора книги и ее названия.
//       Оба свойства должны быть проинициализированы в момент создания книги
//        и изменение состояния объекта после его создания запрещено.
//       Необходимо переопределить методы equals() и hashcode(), а также toString().

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private String bookTittle;
    private String bookAuthor;

    public Book() {
    }

    public Book(String bookTittle, String bookAuthor) {
        this.bookTittle = bookTittle;
        this.bookAuthor = bookAuthor;
    }

    public String getBookTittle() {
        return bookTittle;
    }

    public void setBookTittle(String bookTittle) {
        this.bookTittle = bookTittle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(bookTittle, book.bookTittle) &&
                Objects.equals(bookAuthor, book.bookAuthor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookTittle, bookAuthor);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookTittle='" + bookTittle + '\'' +
                ", bookAuthor='" + bookAuthor + '\'' +
                '}';
    }
}
