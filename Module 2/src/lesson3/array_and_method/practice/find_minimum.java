package lesson3.array_and_method.practice;

public class find_minimum {
    public static void main(String[] args) {
        int [] array = {23, 8, 93, 11, 7, 95};
        int index = minValue(array);
        System.out.println("The smallest element in the array is: " + array[index]);
    }

    public static int minValue(int[] array) {
        int index = 0;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < array[index]) {
                index = i;
            }
        }
        return index;
    }
}
