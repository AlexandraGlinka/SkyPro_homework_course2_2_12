package pro.sky.java.course2.calculator_tests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator_tests.exceptions.DivisionByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceTest {
    private final CalculatorService calculatorService= new CalculatorServiceImpl();
    @Test
    void shouldReturnTextWhenOpenCalculator() {
        String result = calculatorService.welcome();
        Assertions.assertEquals("Добро пожаловать в калькулятор!", result);
    }

    @Test
    void shouldReturn10WhenSumOf3And7() {
        int result = calculatorService.plus(3, 7);
        Assertions.assertEquals(10, result);
    }

    @Test
    void shouldReturn3WhenMinusOf10And7() {
        int result = calculatorService.minus(10, 7);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldReturn15WhenMultiplyOf3And5() {
        int result = calculatorService.multiply(3, 5);
        Assertions.assertEquals(15, result);
    }

    @Test
    void shouldReturn3WhenDivide12By4() {
        int result = calculatorService.divide(12, 4);
        Assertions.assertEquals(3, result);
    }

    @Test
    void shouldThrowExceptionWhenDivideBy0() {
        Assertions.assertThrows(DivisionByZeroException.class, () -> calculatorService.divide(10,0));
    }
}