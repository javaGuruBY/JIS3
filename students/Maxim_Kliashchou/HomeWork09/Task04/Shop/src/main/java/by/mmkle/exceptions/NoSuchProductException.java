package by.mmkle.exceptions;

public class NoSuchProductException extends RuntimeException{
    public NoSuchProductException() {
        super("No such product in stock");
    }
}
