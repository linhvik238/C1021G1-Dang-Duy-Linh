package lesson14_sort_algorithms.exercise;

import java.util.Scanner;

public class InsertionSort {
    public static void insertionSort(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            int currentElement = myArray[i];
            int pos = i;
            while (pos > 0 && currentElement < myArray[pos - 1]) {
                myArray[pos] = myArray[pos - 1];
                pos--;
            }
            myArray[pos] = currentElement;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at " + i + " position");
            array[i] = scanner.nextInt();
        }
        System.out.println("The array before sort: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }
        InsertionSort.insertionSort(array);
        System.out.println("----------------------");
        System.out.println("The array after sorted: ");
        for (int j = 0; j < array.length; j++) {
            System.out.println(array[j] + " ");
        }
    }
}
