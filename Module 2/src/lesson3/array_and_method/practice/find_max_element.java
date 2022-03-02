package lesson3.array_and_method.practice;

import java.util.Scanner;
public class find_max_element {
    public static void main(String[] args) {
        byte size;
        int [] array;
        Scanner scanner = new Scanner (System.in);
        do {
            System.out.println("Enter the size: ");
            size = scanner.nextByte();
            if (size > 20) {
                System.out.println("Size should not exceed 20");
            }
        } while (size > 20);
        array = new int[size];
        byte i = 0;
        while (i < array.length) {
            System.out.println("Enter element" + (i+1) + " : ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.println("Array list: ");
        for (byte j = 0; j < array.length; j++) {
            System.out.println(array[j] + "\t");
        }
        int max = array[0];
        int index = 1;
        for (byte j = 0; j < array.length; j++) {
            if (array[j] > max) {
                max = array[j];
                index = j + 1;
            }
        }
        System.out.println("The largest value in the list is " + max + " , at position " + index);
    }
}
