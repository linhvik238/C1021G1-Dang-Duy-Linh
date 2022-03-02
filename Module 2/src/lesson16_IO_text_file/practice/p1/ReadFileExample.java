package lesson16_IO_text_file.practice.p1;

import java.io.*;
import java.util.Scanner;

public class ReadFileExample {

    public void readFileText (String filePath) {
        try {
            File file = new File(filePath);

            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader br = new BufferedReader((new FileReader(file)));
            String line = "";
            int sum = 0;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
                sum += Integer.parseInt(line);
            }
            br.close();
            System.out.println("Sum = " + sum);
        } catch (Exception e) {
            System.err.println("File does not exist or Error file contents");
        }
    }

    public static void main(String[] args) {
        System.out.println("Please enter file path: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.nextLine();

        ReadFileExample readFileExample = new ReadFileExample();
        readFileExample.readFileText(path);
    }
}
