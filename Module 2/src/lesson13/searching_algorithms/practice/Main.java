package lesson13.searching_algorithms.practice;

import static lesson13.searching_algorithms.practice.BinarySearch.binarySearch;
import static lesson13.searching_algorithms.practice.BinarySearch.list;

public class Main {
    public static void main(String[] args) {
        System.out.println(binarySearch(list, 6));
        System.out.println(binarySearch(list, 11));
        System.out.println(binarySearch(list, 23));
        System.out.println(binarySearch(list, 8));
        System.out.println(binarySearch(list, 93));
        System.out.println(binarySearch(list, 95));
    }
}
