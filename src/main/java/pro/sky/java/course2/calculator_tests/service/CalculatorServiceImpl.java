package pro.sky.java.course2.calculator_tests.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator_tests.exceptions.DivisionByZeroExceprion;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String welcome() {
        return "Добро пожаловать в калькулятор!";
    }

    @Override
    public int plus(int num1, int num2) {
        return num1 + num2;
    }

    @Override
    public int minus(int num1, int num2) {
        return num1 - num2;
    }

    @Override
    public int multiply(int num1, int num2) {
        return num1 * num2;
    }

    @Override
    public int divide(int num1, int num2) {
        if (num2 == 0) {
            throw new DivisionByZeroExceprion("Делить на 0 нельзя");
        } else
        return num1 / num2;
    }
}
