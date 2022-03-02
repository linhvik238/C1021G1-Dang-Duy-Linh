package lesson8_clean_code.practice;

public class Calculator {

    public static final char Addition = '+';
    public static final char Subtraction = '-';
    public static final char Multiplication = '*';
    public static final char Division = '/';

    public static int calculate (int firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case Addition:
                return firstOperand + secondOperand;
            case Subtraction:
                return firstOperand - secondOperand;
            case Multiplication:
                return firstOperand * secondOperand;
            case Division:
                if (secondOperand != 0)
                    return firstOperand / secondOperand;
                else
                    throw new RuntimeException ("Can not divided by 0");
            default:
                throw new RuntimeException ("Unsupported operation");
        }
    }
}
