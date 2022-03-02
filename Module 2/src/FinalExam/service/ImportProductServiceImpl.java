package FinalExam.service;

import FinalExam.model.ExportProduct;
import FinalExam.model.ImportProduct;
import FinalExam.service.implement.IProductService;
import Test_Exam.model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ImportProductServiceImpl implements IProductService {
    public static final String FILE_IMPORTPRODUCT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FinalExam\\data\\importProduct.csv";
    Scanner scanner = new Scanner(System.in);
    static List<ImportProduct> importProductList = new ArrayList<>();
    boolean check;

    public ImportProductServiceImpl()  {
        readFile();
    }
    @Override
    public void add() {
        int price = 0;
        int quantity = 0;
        int importPrice = 0;
        String importCity;
        double tax = 0;

        System.out.println("Please enter product code: ");
        String productCode = scanner.nextLine();
        System.out.println("Please enter name of product: ");
        String name = scanner.nextLine();
        try {
            System.out.println("Please enter price of product: ");
            price = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        while (price < 0) {
            System.out.println("Price must greater than 0, please try again!");
            price = Integer.parseInt(scanner.nextLine());
        }
        try {
            System.out.println("Please enter quantity: ");
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        while (quantity < 0) {
            System.out.println("Quantity must greater than 0, please try again!");
            quantity = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Please enter product producer: ");
        String producer = scanner.nextLine();
        try {
            System.out.println("Please enter import price of product: ");
            importPrice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        while (importPrice < 0) {
            System.out.println("Price must greater than 0, please try again!");
            importPrice = Integer.parseInt(scanner.nextLine());
        }
        System.out.println("Please enter import city of product: ");
        importCity = scanner.nextLine();
            try {
                System.out.println("Please enter import tax of product: ");
                tax = Double.parseDouble(scanner.nextLine());

            } catch (NumberFormatException e) {
                System.out.println("Please input only number!");
            }

            while (tax < 0) {
                System.out.println("Tax must greater than 0, please try again!");
                tax = Integer.parseInt(scanner.nextLine());
            }


        ImportProduct importProduct = new ImportProduct(productCode, name, price, quantity,
                producer, importPrice, importCity, tax);
        importProductList.add(importProduct);
        writeFile();
    }


    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input product code you wanna delete.");
        String code = scanner.nextLine();
        for (int i = 0; i < importProductList.size(); i++) {
            if (importProductList.get(i).getProductCode().equals(code)) {
                System.out.println("Yes or No");
                String choice = scanner.nextLine();
                if (choice.toLowerCase().equals("yes")) {
                    importProductList.remove(i);
                    System.out.println("You have successfully delete the product");
//                        writeAuthPhoneToFile();
                } else {
                    System.out.println("Delete unsuccessfully.......");
                }
            } else {
                System.out.println("The product you wanna delete is not in import product list!");
                break;
            }
        }
    }

    @Override
    public void display() {
        for (ImportProduct a : importProductList) {
            System.out.println(a);
        }
    }

    @Override
    public void searchCode() {
        check = false;
        System.out.println("Please input code of product you wanna search: ");
        String code = scanner.nextLine();
        System.out.println("The product you are looking for is: ");
        for (ImportProduct a : importProductList) {
            if (a.getName().toLowerCase().contains(code.toLowerCase())) {
                System.out.println(a);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The product you are looking for is not in the import product list!");
        }
    }


    @Override
    public void searchName() {
        check = false;
        System.out.println("Please input name of product you wanna search: ");
        String name = scanner.nextLine();
        System.out.println("The product you are looking for is: ");
        for (ImportProduct a : importProductList) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(a);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The product you are looking for is not in the import product list!");
        }
    }

    public static void writeFile(){
        try {
            FileWriter fileWriter = new FileWriter(FILE_IMPORTPRODUCT);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            for (ImportProduct a : importProductList){
                bufferedWriter.write(a.getId()+","+ a.getProductCode()
                        +","+ a.getName()+","+ a.getPrice()
                        +","+ a.getQuantity()+","+ a.getProducer()
                        +","+ a.getImportPrice()+","+ a.getImportCity()
                        +","+ a.getImportTax());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void readFile(){
        importProductList.clear();
        try {
            FileReader fileReader = new FileReader(FILE_IMPORTPRODUCT);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String data;
            while ((data = bufferedReader.readLine())!=null){
                String[] newData = data.split(",");
                ImportProduct importedProducts = new ImportProduct(newData[0],newData[1],
                        Integer.parseInt(newData[2]),Integer.parseInt(newData[3]),
                        newData[4],Integer.parseInt(newData[5]),
                        newData[6],Double.parseDouble(newData[7]));
                importProductList.add(importedProducts);
            }
            bufferedReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
