package by.rybak.exceptions;

import java.sql.SQLException;

public class MyException extends SQLException {
    public MyException(String message) {
        super(message);
    }
}
