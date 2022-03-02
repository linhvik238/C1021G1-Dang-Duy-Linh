package lesson3.array_and_method.exercise;

import java.util.Scanner;

public class add_element_in_array {
    public static void main(String[] args) {
        int[] array = new int[10];
        array[0] = 23;
        array[1] = 8;
        array[2] = 93;
        array[3] = 11;
        array[4] = 7;
        array[5] = 95;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wanna add into the array");
        int x = input.nextInt();
        System.out.println("Please enter an index position of the number you wanna add into the array");
        int index = input.nextInt();
        if (index <= -1 && index >= array.length - 1) {
            System.out.println("Could not add the number into the array");
        } else {
            for (int i = array.length - 1; i > index; i--) {
                    array[i] = array[i - 1];
            }
            array[index] = x;
            for (int j = 0; j < array.length; j++) {
                System.out.println(array[j]);
            }
        }
    }
}
