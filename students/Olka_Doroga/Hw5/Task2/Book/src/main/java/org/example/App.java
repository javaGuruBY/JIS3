package org.example;

import org.example.bean.Book;

public class App {
    public static void main(String[] args) {
        Book book1 = new Book("Robert Green", "The one", 215);
        Book book2 = new Book();

        book2.setAuthor("Oll Flower");
        book2.setTitle("Home");
        book2.setNumberOfPages(301);

        System.out.println(book1);
        System.out.println(book2);
    }
}
