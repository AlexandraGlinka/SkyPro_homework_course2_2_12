package pro.sky.java.course2.calculator_tests.service;

import net.bytebuddy.asm.Advice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorServiceParamTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @ParameterizedTest
    @MethodSource("argumentsForSumTest")
    public void shouldReturnSum(int num1, int num2, int expected) {
        int result = calculatorService.plus(num1, num2);
        Assertions.assertEquals(expected, result);
    }

    private static Stream<Arguments> argumentsForSumTest() {
        return Stream.of(
                Arguments.of(1, 2, 3),
                Arguments.of(100, 100, 200),
                Arguments.of(9999, 1, 10000)
        );
    }

    @ParameterizedTest
    @CsvSource({"2,3,6", "4,5,20", "45,0,0"})
    public void shouldReturnMultiply(int num1, int num2, int expected) {
        int result = calculatorService.multiply(num1, num2);
        Assertions.assertEquals(expected, result);
    }
}
