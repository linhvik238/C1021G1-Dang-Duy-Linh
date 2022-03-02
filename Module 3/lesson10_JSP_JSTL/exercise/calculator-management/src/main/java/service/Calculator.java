package service;

public class Calculator {
    public static String calculate(Double num1, Double num2, String operator) {
        switch (operator) {
            case "addition":
                return num1 + num2 + "";
            case "subtraction":
                return num1 - num2 + "";
            case "multiplication":
                return num1 * num2 + "";
            default:
                try {
                    if (num2 == 0) {
                        throw new Exception();
                    }
                    return num1 / num2 + "";
                } catch (Exception e) {
                    return "Can not divide for 0";
                }
        }
    }

    public static String operator(String operator) {
        switch (operator) {
            case "addition":
                return "+";
            case "subtraction":
                return "-";
            case "multiplication":
                return "*";
            default:
                return "/";
        }
    }
}
