package by.khilko.bean;

import java.io.Serializable;
import java.util.Objects;

public class Book implements Serializable {
    private String author;
    private String titleBook;
    private int page;

    public Book() {
    }

    public Book(String author, String titleBook, int page) {
        this.author = author;
        this.titleBook = titleBook;
        this.page = page;
    }

    public String getAuthor() {


        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitleBook() {
        return titleBook;
    }

    public void setTitleBook(String titleBook) {
        this.titleBook = titleBook;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        Book book = (Book) o;
        return page == book.page &&
                author.equals(book.author) &&
                titleBook.equals(book.titleBook);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, titleBook, page);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", titleBook='" + titleBook + '\'' +
                ", page=" + page +
                '}';
    }
}
