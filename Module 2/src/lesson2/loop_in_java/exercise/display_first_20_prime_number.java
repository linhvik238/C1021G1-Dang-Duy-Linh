package lesson2.loop_in_java.exercise;

import java.util.Scanner;
public class display_first_20_prime_number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount of PrimeNumber you wanna print: ");
        int numbers = input.nextByte();
        int count = 0;
        int n = 2;
        String result = "";
        boolean check = true;
        while (count < numbers) {
            check = true;
        for (int i = 2; i <= Math.sqrt(n); i++){
            if (n % i == 0) {
                check = false;
                break;
            }
        }
            if (check == true) {
                result += n + "\n";
                count++;
            }
            n++;
        }
        System.out.println(result);
    }
}
