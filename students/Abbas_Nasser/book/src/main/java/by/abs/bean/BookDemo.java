package by.abs.bean;
import by.abs.bean.Book;




public class BookDemo {
    public static void main(String[] args) {

        Book book = new Book("the six pillars of self-esteem",
                            "Nathanial Branden",
                             373);

        System.out.println("our book is " + book.getTitle() + " by " + book.getAuthor() + " consists of " +
                           book.getNumOfPages() + " pages");




    }
}
