package lesson1.introduction.practice;
import java.util.Scanner;
public class Linear_equation_resolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Linear Equation Resolver");

        System.out.println("Given an equation as 'a * x + b = c' please enter constants:");

        System.out.println("a: ");
        double a = scanner.nextDouble();

        System.out.println("b: ");
        double b = scanner.nextDouble();

        System.out.println("c: ");
        double c = scanner.nextDouble();

        if (a != 0) {
            double result = (c-b) / a;
            System.out.printf("Equation pass with x = %f!\n" , result);
        } else {
            if (b==c) {
                System.out.println("The solution is all x!");
            } else {
                System.out.println("No solution!");
            }
        }
    }
}
