package lesson1.introduction.practice;

import java.util.Scanner;

public class Bmi_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Your weight (in kilogram):");
        double weight = scanner.nextDouble();
        System.out.println("Your height (in meter):");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height, 2);
        System.out.printf("%-20s%s", "bmi", "Interpretation\n");
        if (bmi < 18)
            System.out.printf("%-20s%s", bmi, "Underweight");
        else if (bmi < 25.0)
            System.out.printf("%-20s%s", bmi, "Normal");
        else if (bmi < 30.0)
            System.out.printf("%-20s%s", bmi, "Overweight");
        else
            System.out.printf("%-20s%s", bmi, "Obese");
    }
}
