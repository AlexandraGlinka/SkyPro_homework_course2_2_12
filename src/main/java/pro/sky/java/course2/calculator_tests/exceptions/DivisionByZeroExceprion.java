package pro.sky.java.course2.calculator_tests.exceptions;

public class DivisionByZeroExceprion extends RuntimeException{
    public DivisionByZeroExceprion() {
    }

    public DivisionByZeroExceprion(String message) {
        super(message);
    }

    public DivisionByZeroExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public DivisionByZeroExceprion(Throwable cause) {
        super(cause);
    }
}
