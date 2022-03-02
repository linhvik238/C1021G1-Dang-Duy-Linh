package lesson16_IO_text_file.practice.p2;

import java.util.List;

public class FindMaxValue {

    public static final String FILE_INPUT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson16_IO_text_file\\practice\\p2\\numbers.txt";
    public static final String FILE_OUTPUT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson16_IO_text_file\\practice\\p2\\result.txt";

    public static int findMax(List<Integer> numbers){
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile(FILE_INPUT);
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile(FILE_OUTPUT, maxValue);
    }
}
