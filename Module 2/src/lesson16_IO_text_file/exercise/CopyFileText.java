package lesson16_IO_text_file.exercise;

import java.io.*;

public class CopyFileText {
    public static void main(String[] args) {
        final String FILE_INPUT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson16_IO_text_file\\exercise\\input.txt";
        final String FILE_OUTPUT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson16_IO_text_file\\exercise\\output.txt";
        File fileRead = new File(FILE_INPUT);
        File fileWrite = new File(FILE_OUTPUT);
        if (!fileRead.exists() || !fileWrite.exists()) {
            try {
                throw new IOException("File not exist");
            } catch (IOException e) {
                System.out.println("File not exist or Error File Contents");
            }
        }
        try {
            FileReader fileReader = new FileReader(fileRead);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            FileWriter fileWriter = new FileWriter(fileWrite);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            String data = "";
            while ((data = bufferedReader.readLine()) != null) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
