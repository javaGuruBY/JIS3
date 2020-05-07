package by.jrr.library.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {

    private String nameAuthor;
    private String nameBook;

    public Book() {
    }
    public Book(String author, String name) {
        this.nameAuthor = author;
        this.nameBook = name;
    }

    public String getNameAuthor() {
        return nameAuthor;
    }

    public void setNameAuthor(String nameAuthor) {
        this.nameAuthor = nameAuthor;
    }

    public String getNameBook() {
        return nameBook;
    }

    public void setNameBook(String nameBook) {
        this.nameBook = nameBook;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(nameAuthor, book.nameAuthor) &&
                Objects.equals(nameBook, book.nameBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nameAuthor, nameBook);
    }

    @Override
    public String toString() {
        return "Book{" +
                "nameAuthor='" + nameAuthor + '\'' +
                ", nameBook='" + nameBook + '\'' +
                '}';
    }
}
