package com.codegym.service.impl;

import com.codegym.service.CalculatorService;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String Calculate(double number1, double number2, String caculate) {
        String result ="";
        switch (caculate) {
            case "+":
                result = number1 + number2+"";
                break;
            case "-":
                result = number1 - number2+"";
                break;
            case "X":
                result = number1 * number2+"";
                break;
            case "/":
                result = number1 / number2+"";
                break;
        }
        return result;
    }
}
