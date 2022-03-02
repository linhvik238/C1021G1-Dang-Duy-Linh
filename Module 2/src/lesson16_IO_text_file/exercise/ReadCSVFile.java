package lesson16_IO_text_file.exercise;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadCSVFile {

    public static final String CSV = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson16_IO_text_file\\exercise\\CountryList.csv";

    public static void main(String[] args) {
        List<CountryList> countryList = new ArrayList<>();
        try {
            File file = new File(CSV);
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String str = "";
            while (((str = bufferedReader.readLine()) != null)) {
                String[] countryStr = str.split(",");

                CountryList country = new CountryList(Integer.parseInt(countryStr[0]), countryStr[1], countryStr[2]);
                countryList.add(country);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (CountryList list1 : countryList) {
            System.out.println(list1.getName());
        }
    }
}

