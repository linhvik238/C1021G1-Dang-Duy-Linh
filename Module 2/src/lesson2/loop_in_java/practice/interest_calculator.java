package lesson2.loop_in_java.practice;

import java.util.Scanner;
public class interest_calculator {
    public static void main(String[] args) {
        double money = 1.0;
        byte month = 1;
        double interestRate = 1.0;
        Scanner input = new Scanner (System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months: ");
        month = input.nextByte();
        System.out.println("Enter annual interest rate in percentage: ");
        interestRate = input.nextDouble();
        double totalInterest = 0;
        for (int i = 1; i <= month; i++) {
            totalInterest += money * (interestRate/100) / 12 * month;
        }
        System.out.println("Total of interest: " + totalInterest);
    }
}
