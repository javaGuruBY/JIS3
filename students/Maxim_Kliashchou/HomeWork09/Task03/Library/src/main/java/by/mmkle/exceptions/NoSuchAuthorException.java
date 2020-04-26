package by.mmkle.exceptions;

public class NoSuchAuthorException extends RuntimeException{
    public NoSuchAuthorException() {
        super("No such author in library");
    }
}
