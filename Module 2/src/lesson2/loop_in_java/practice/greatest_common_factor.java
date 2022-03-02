package lesson2.loop_in_java.practice;

import java.util.Scanner;
public class greatest_common_factor {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int a;
        int b;
        System.out.println("Please input a: ");
        a = input.nextInt();
        System.out.println("Please input b: ");
        b = input.nextInt();
        a = Math.abs(a);
        b = Math.abs(b);
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        System.out.println("Greatest common factor: " + a);
    }
}
