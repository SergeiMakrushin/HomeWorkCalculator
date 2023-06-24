package com.example.homeworkcalculator;

import com.example.homeworkcalculator.servise.CalculatorServiseImpl;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContextException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTest {
    private final CalculatorServiseImpl calculatorServise = new CalculatorServiseImpl();

    @Test
    void checkExceptionDivision() {
        assertThrows(IllegalArgumentException.class,
                () -> calculatorServise.division(1, 0), "НЕПРАВИЛЬНОЕ ИСКЛЮЧЕНИЕ, ТРЕБУЕТСЯ IllegalArgumentException"
        );
    }

    @Test
    public void divisionTest() {
        int result = calculatorServise.division(6, 1);
        assertEquals(6, result);
    }
    @Test
    public void divisionTest2() {
        int result = calculatorServise.division(8, 2);
        assertEquals(4, result);
    }



    @Test
    public void sumTest() {
        int result = calculatorServise.sum(6, 2);
        assertEquals(8, result);

    }
    @Test
    public void sumTest2() {
        int result = calculatorServise.sum(10, 10);
        assertEquals(20, result);

    }


    @Test
    public void multiplicationTest() {
        int result = calculatorServise.multiplication(6, 2);
        assertEquals(12, result);
    }
    @Test
    public void multiplicationTest2() {
        int result = calculatorServise.multiplication(4, 4);
        assertEquals(16, result);
    }


    @Test
    public void subtractionTest() {
        int result = calculatorServise.subtraction(6, 2);
        assertEquals(4, result);
    }
    @Test
    public void subtractionTest2() {
        int result = calculatorServise.subtraction(3, 1);
        assertEquals(2, result);
    }

}
