package by.mmkle.exceptions;

public class NoSuchBookException extends RuntimeException{
    public NoSuchBookException() {
        super("No such book in library");
    }
}
