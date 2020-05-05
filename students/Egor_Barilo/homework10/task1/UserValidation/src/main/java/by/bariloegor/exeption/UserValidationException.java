package by.bariloegor.exeption;

public class UserValidationException extends RuntimeException{
    public UserValidationException(String message) {
        super(message);
    }
}
