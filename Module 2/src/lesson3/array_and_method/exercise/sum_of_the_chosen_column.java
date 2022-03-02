package lesson3.array_and_method.exercise;

import java.util.Scanner;
public class sum_of_the_chosen_column {
    public static void main(String[] args) {
        int m, n;
        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the row of the matrix: ");
        m = input.nextInt();
        System.out.println("Please enter the column of the matrix: ");
        n = input.nextInt();

        int[][] array = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("array[" + i + "] [" + j + "] = ");
                array[i][j] = input.nextInt();
            }
        }
        System.out.println("Enter the column you wanna calculate sum: ");
        int choice = input.nextInt();
    }
}
