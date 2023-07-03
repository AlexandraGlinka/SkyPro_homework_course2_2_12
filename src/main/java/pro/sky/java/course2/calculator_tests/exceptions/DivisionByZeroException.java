package pro.sky.java.course2.calculator_tests.exceptions;

public class DivisionByZeroException extends RuntimeException{
    public DivisionByZeroException(String message) {
        super(message);
    }

    public DivisionByZeroException(String message, Throwable cause) {
        super(message, cause);
    }
}
