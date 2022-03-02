package lesson13.searching_algorithms.practice;

public class BinarySearch {
    static int[] list = {4, 6, 7, 8, 11, 13, 23, 92, 93, 95};

    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (key < list[mid]) {
                high = mid - 1;
            } else if (key == list[mid]) {
                return mid;
            } else {
                low = mid + 1;
            }
        }
        return -1; //Now high < low, key not found
    }
}