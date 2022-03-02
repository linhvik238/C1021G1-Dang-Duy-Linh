package lesson3.array_and_method.practice;

import java.util.Scanner;
public class find_element_in_array {
    public static void main(String[] args) {
        String [] footballPlayer = {"Ronaldo", "Messi", "Ozil", "Scholes", "Rooney", "Beckham"};
        Scanner scanner = new Scanner (System.in);
        System.out.println("Enter a footballer's name: ");
        String input_name = scanner.nextLine();
        boolean isExist = false;
        for (byte i = 0; i < footballPlayer.length; i++) {
            if (footballPlayer[i].equals(input_name)) {
                System.out.println("Position of " + input_name + " in the list is: " + i);
                isExist = true;
                break;
            }
        }
        if (!isExist) {
            System.out.println("Not found " + input_name + " in the list.");
        }
    }
}
