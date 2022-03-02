package lesson2.loop_in_java.exercise;

import java.util.Scanner;

public class Display_geometries {
    public static void main(String[] args) {

        int choice = -1;
        Scanner input = new Scanner(System.in);
        choice = input.nextInt();
        while (choice != 4) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Please enter your choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Printing the rectangle");
                    System.out.println("Please input the width of the rectangle");
                    byte width = input.nextByte();
                    System.out.println("Please input the height of the rectangle");
                    byte height = input.nextByte();
                    String rectangle = "";
                    for (byte i = 1; i <= height; i++) {
                        for (byte j = 1; j <= width; j++) {
                            rectangle += "*";
                        }
                        rectangle += "\n";
                    }
                    System.out.println(rectangle);
                    break;
                case 2:
                    System.out.println("Printing the square triangle at bottom_left");
                    System.out.println("Please input the height of the triangle");
                    byte heightSquareTriangle = input.nextByte();
                    String squareTriangleBTL = "";
                    for (byte i = 1; i <= heightSquareTriangle; i++) {
                        for (byte j = 1; j <= i; j++) {
                            squareTriangleBTL += " * ";
                        }
                        squareTriangleBTL += "\n";
                    }
                    System.out.println(squareTriangleBTL);
                    // In hình tam giác vuông, có cạnh góc vuông ở top-left
                    System.out.println("Printing the square triangle at Top_left");
                    System.out.println("Please input the height of the triangle");
                    byte heightSquareTriangleTL = input.nextByte();
                    String squareTriangleTL = "";
                    for (byte i = heightSquareTriangleTL; i >= 1; i--) {
                        for (byte j = 1; j <= i; j++) {
                            squareTriangleTL += " * ";
                        }
                        squareTriangleTL += "\n";
                    }
                    System.out.println(squareTriangleTL);
                    break;
                case 3:
                    // In hình tam giác cân
                    System.out.println("Printing the isosceles triangle");
                    System.out.println("Please input the height of the isosceles triangle");
                    byte heightIsoscelesTriangle = input.nextByte();
                    String isoscelesTriangle = "";
                    for (byte i = 1; i <= heightIsoscelesTriangle; i++) {
                        for (byte j = 1; j <= (heightIsoscelesTriangle * 2 - 1); j++) {
                            if ((j >= heightIsoscelesTriangle - i + 1 && j <= heightIsoscelesTriangle + i - 1)
                                    || i == heightIsoscelesTriangle) {
                                isoscelesTriangle += "*";
                            } else
                                isoscelesTriangle += " ";
                        }
                        isoscelesTriangle += "\n";
                    }
                    System.out.println(isoscelesTriangle);
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
