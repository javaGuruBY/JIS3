package by.jrr.Book;

import by.jrr.Book.bean.Book;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.setAuthor("J.R.R. Tolkien");
        book1.setBookName("The Lord of the Rings");
        book1.setNumPage((short) 1137);
        System.out.println("First book write " + book1.getAuthor() + " name book: " + book1.getBookName() + " page count: "
                + book1.getNumPage());
    }
}
