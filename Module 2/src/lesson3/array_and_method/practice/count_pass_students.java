package lesson3.array_and_method.practice;

import java.util.Scanner;
public class count_pass_students {
    public static void main(String[] args) {
        int size;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Enter a size: ");
            size = scanner.nextInt();
            if (size > 30) {
                System.out.println("Size should not exceed 30!");
            }
        } while (size > 30);
        int [] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a mark for student " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }
        int count = 0;
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
            if (array[j] >= 5 && array[j] <= 10) {
                count++;
            }
        }
        System.out.println("\n the number of students passing the exam is " + count);
    }
}