package lesson1.introduction.practice;

import java.util.Scanner;

public class Leap_year_calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a year you wanna check: ");
        int year = scanner.nextInt();
        //Cách xác định năm nhuận: Những năm chia hết cho 4 là năm nhuận, ngoại trừ những năm chia hết cho 100 mà không chia hết cho 400.
        //Từ đó, có thể rút gọn thành các quy tắc xác định năm nhuận:
        //Những năm chia hết cho 4 mà không chia hết cho 100 là năm nhuận
        //Những năm chia hết cho 100 mà không chia hết cho 400 thì KHÔNG PHẢI là năm nhuận
        //Những năm chia hết đồng thời cho 100 và 400 là năm nhuận
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                if (year % 400 == 0) {
                    System.out.printf("%d is a leap year", year);
                } else {
                    System.out.printf("%d is NOT a leap year", year);
                }
            } else {
                System.out.printf("%d is a leap year", year);
            }
        } else {
            System.out.printf("%d is NOT a leap year" , year);
        }
    }
}
