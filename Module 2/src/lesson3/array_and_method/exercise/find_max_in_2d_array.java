package lesson3.array_and_method.exercise;

import java.util.Scanner;
public class find_max_in_2d_array {
    public static void main(String[] args) {
        int m, n;

        Scanner input = new Scanner (System.in);
        System.out.println("Please enter the row of the matrix: ");
        m = input.nextInt();
        System.out.println("Please enter the column of the matrix: ");
        n = input.nextInt();

        int [][] arrayA = new int[m][n];
        System.out.println("Please enter the elements of the matrix: ");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println("arrayA[" + i + "] [" + j + "] = " );
                arrayA[i][j] = input.nextInt();
            }
        }
        int max = arrayA[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < arrayA[i][j]) {
                    max = arrayA[i][j];
                }
            }
        }
        System.out.println("The max value in the matrix is: " + max);
    }
}
