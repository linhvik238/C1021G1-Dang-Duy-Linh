package lesson15_exception_handling_and_debug.exercise;

import java.util.Scanner;

public class TriangleException {

    public static void illegalTriangleException() throws Exception {
        Scanner scanner = new Scanner(System.in);
        boolean check;
        do {
            check = false;
            try {
                System.out.println("Please enter edge a: ");
                int a = Integer.parseInt(scanner.nextLine());
                if (a < 0) {
                    throw new IllegalTriangleException("Cannot input negative number, please try again!");
                }
                System.out.println("Please enter edge b: ");
                int b = Integer.parseInt(scanner.nextLine());
                if (b < 0) {
                    throw new IllegalTriangleException("Cannot input negative number, please try again!");
                }
                System.out.println("Please enter edge c: ");
                int c = Integer.parseInt(scanner.nextLine());
                if (c < 0) {
                    throw new IllegalTriangleException("Cannot input negative number, please try again!");
                }
                if (a + b <= c || a + c <= b || b + c <= a) {
                    throw new IllegalTriangleException("Sum of 2 edges must greater than the another one, please try again!");
                }
            } catch (IllegalTriangleException e) {
                check = true;
                System.err.println(e.getError());
            } catch (Exception e1) {
                check = true;
                System.out.println(e1.getStackTrace());;
            }
        } while (check);
    }

    public static void main(String[] args) {
        try {
            illegalTriangleException();
        } catch (IllegalTriangleException e) {
            System.out.println(e.getError());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
