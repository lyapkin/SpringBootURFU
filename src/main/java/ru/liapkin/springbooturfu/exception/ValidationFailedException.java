package ru.liapkin.springbooturfu.exception;

public class ValidationFailedException extends Exception {

    public ValidationFailedException(String message) {
        super(message);
    }

}
