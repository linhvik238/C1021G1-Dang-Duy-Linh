package lesson1.introduction.exercise;

import java.util.Scanner;

public class Money_exchange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of USD you would like to change");
        int usd = scanner.nextInt();
        int rate = 23000;
        int vnd = usd * rate;
        System.out.print("Số tiền VND sau khi quy đổi là:" + vnd);
    }
}
