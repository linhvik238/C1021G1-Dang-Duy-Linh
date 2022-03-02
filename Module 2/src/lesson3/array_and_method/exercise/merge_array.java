package lesson3.array_and_method.exercise;

import java.util.Arrays;
import java.util.Scanner;
public class merge_array {
    public static void main(String[] args) {
        int[] arrayA = new int[5];
        int[] arrayB = new int[5];
        int[] arrayC = new int[10];
        for (int i = 0; i < arrayA.length; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please enter the element at index " + i + " in array A");
            arrayA[i] = input.nextInt();
            System.out.println("Please enter the element at index " + i + " in array B");
            arrayB[i] = input.nextInt();
        }
        System.out.println("Array A is: " + Arrays.toString(arrayA));
        System.out.println("Array B is: " + Arrays.toString(arrayB));

        for (int j = 0; j < arrayA.length; j++) {
            arrayC[j] = arrayA[j];
        }
        for (int k = 0; k < arrayB.length; k++) {
            arrayC[arrayB.length + k] = arrayB[k];
        }
        System.out.println("Array C is: " + Arrays.toString(arrayC));
    }
}
