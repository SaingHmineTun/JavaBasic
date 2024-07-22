package it.saimao.Lesson63_ThrowNewException;

public class NumberInvalidException extends Exception {

    public NumberInvalidException(String message) {
        super(message);
    }

}
