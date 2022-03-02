package lesson11_dsa_stack_queue.exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class MyMap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Please enter a string: ");
        String string = scanner.nextLine();
        Character character;
        Map<Character, Integer> mapWord = new TreeMap<>();
        for (int i = 0; i < string.length(); i++) {
            character = string.charAt(i);
            if (mapWord.containsKey(character)) {
                int value = mapWord.get(character);
                mapWord.put(character, value + 1);
            } else {
                mapWord.put(character , 1);
            }
        }
        System.out.println(mapWord);
    }
}
