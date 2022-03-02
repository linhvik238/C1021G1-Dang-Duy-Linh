package lesson1.introduction.exercise;

import java.util.Scanner;
public class Display_hello {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello:" + name);
    }
}
