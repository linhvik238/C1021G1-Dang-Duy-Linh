package lesson15_exception_handling_and_debug.practice;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample {
    public Integer [] createRandom() {
        Random rd = new Random();
        Integer [] arr = new Integer[100];
        System.out.println("Danh sách các phần tử của mảng là: ");
        for (int i = 0; i < 100; i++) {
            arr[i] = rd.nextInt(100);
            System.out.println(arr[i] + " ");
        }
        return arr;
    }

    public static void main(String[] args) {
        ArrayExample arrayExample = new ArrayExample();
        Integer [] arr = arrayExample.createRandom();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vị trí của 1 phần tử bất kỳ: ");
        int x = scanner.nextInt();
        try {
            System.out.println("Giá trị của phần tử ở vị trí " + x + " là " + arr[x]);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Vị trí vượt quá giới hạn của mảng");
        }
    }
}
