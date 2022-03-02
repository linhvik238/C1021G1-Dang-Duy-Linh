package lesson3.array_and_method.exercise;

import java.util.Scanner;

public class delete_an_element_in_array {
    public static void main(String[] args) {
        int[] array = {23, 8, 93, 7, 11, 95};
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a number you wanna remove from the array");
        int x = input.nextInt();
        int index;
        for (int i = 0; i < array.length; i++) {
            if (x == array[i]) {
                index = i;
                System.out.println("Index  to delete :" + index);
                for (int j = index; j < array.length - 1; j++) {
                    array[j] = array[j + 1];
                }
            }
        }
        System.out.println("Array after deleting the element");
        for (int j = 0; j < array.length - 1; j++) {
            System.out.println(array[j]);
        }
    }
}

