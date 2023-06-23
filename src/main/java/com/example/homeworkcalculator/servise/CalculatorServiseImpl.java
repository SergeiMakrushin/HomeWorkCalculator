package com.example.homeworkcalculator.servise;


import org.springframework.stereotype.Service;

@Service
public class CalculatorServiseImpl implements CalculatorServise {
    @Override
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public int sum(int num1, int num2) {
        int sum = num1 + num2;
        return sum;
    }

    @Override
    public int subtraction(int num1, int num2) {
        int subtraction = num1 - num2;
        return subtraction;
    }

    @Override
    public int multiplication(int num1, int num2) {
        int multiplication = num1 * num2;
        return multiplication;
    }

    @Override
    public int division(int num1, int num2) {
        if (num2 == 0) {
            try {
                throw new Exception("Нельзя делить на 0");
            } catch (Exception e) {
                throw new IllegalArgumentException(e);
            }
        }

        int division = num1 / num2;
        return division;

    }
}