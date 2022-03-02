package lesson14_sort_algorithms.practice;

public class BubbleSort {
    //    static int[] list = {23, 8, 11, 7, -32, -13, 25, 15};
//    public static void bubbleSort (int[] list) {
//        boolean needNextPass = true;
//        for (int k = 1; k < list.length && needNextPass; k++) {
//            needNextPass = false;
//            for (int i = 0; i < list.length - k; i++) {
//                if (list[i] > list [i + 1]) {
//                    int temp = list [i];
//                    list [i] = list [i + 1];
//                    list [i + 1] = temp;
//
//                    needNextPass = true;
//                }
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        bubbleSort(list);
//        for (int i = 0; i < list.length; i++) {
//            System.out.println(list[i] + " ");
//        }
//    }
    public static void main(String[] args) {
        int[] array = {23, 8, 93, 11, 7, 95};
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
            for (
                    int newArray : array) {
                System.out.println(newArray);
            }
        }
    }
}
