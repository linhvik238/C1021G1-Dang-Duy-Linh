package lesson11_dsa_stack_queue.exercise;

import java.util.Stack;
import java.util.Scanner;

public class StackClient {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the amount of element: ");
        int length = Integer.parseInt(scanner.nextLine());
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.println("Please input element at " + i + " position");
            array[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println("The integer array before reverse: ");
        for (int enteredArray : array) {
            System.out.println(enteredArray);
        }
        System.out.println("--------------------------------");
        Stack<Integer> stack = new Stack<Integer>();
        int[] reverseArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            stack.push(array[i]);
        }
        System.out.println("The integer array after reversed: ");
        for (int i = 0; i < array.length; i++) {
            reverseArray[i] = stack.pop();
            System.out.println(reverseArray[i]);
        }

        Stack<Character> wordStack = new Stack<>();
        String mWord = "Hello C1021G1";
        System.out.println("The sentence before reverse: " + mWord);
        for (int i = 0; i < mWord.length(); i++) {
            wordStack.push(mWord.charAt(i));
        }
        System.out.println("-----------------------------");
        String reverseWord = "";
        for (int i = 0; i < mWord.length(); i++) {
            reverseWord += wordStack.pop();
        }
        System.out.println("The sentence after reversed: " + reverseWord);
    }
}
