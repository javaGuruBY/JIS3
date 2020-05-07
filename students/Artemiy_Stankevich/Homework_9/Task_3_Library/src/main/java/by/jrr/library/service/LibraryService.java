package by.jrr.library.service;

import by.jrr.library.bean.Book;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class LibraryService {

     private final Set<Book> library = new HashSet<>();

    public Set<Book> getLibrary() {
        return library;
    }

    public void addBookInLibrary(Book book) {
            library.add(book);
      }

      public void deleteBookFromLibrary(Book book) {
            library.remove(book);
      }

      public Book findByBookInLibrary(String nameBook) {
           for(Book books:library) {
               if(books.getNameBook().equals(nameBook)) {
                   return books;
               }
           }
           return null;
      }

      public String returnAllBooksByAuthor(String authors) {
          List<String> allBooksByAuthor = new ArrayList<>();
          for (Book author: library) {
              if(author.getNameAuthor().equals(authors)) {
                  allBooksByAuthor.add(author.getNameBook());
              }
          }
          String result = "All books Author: " + authors + ": " + allBooksByAuthor;
          return result;
      }
}
