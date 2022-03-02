package lesson3.array_and_method.exercise;

import java.util.Scanner;
public class find_min_element {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a size :");
        int size = scanner.nextInt();
        int[] Array = new int[size];

        for (int i = 0 ; i < size ; i++) {
            System.out.println("Enter a element Array :" + i);
            Array[i] = scanner.nextInt();
        }
        int min = Array[0];
        for (int i = 0 ; i < Array.length ; i++){
            if (Array[i] < min){
                min = Array[i];
            }
        }
        System.out.println("Gia tri nho nhat la :" + min);
    }
}

