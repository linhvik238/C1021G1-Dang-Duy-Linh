package lesson17_IO_binary_file_serialization.exercise.Controller;

import lesson17_IO_binary_file_serialization.exercise.Model.Product;
import lesson17_IO_binary_file_serialization.exercise.Service.Implement.ProductServiceImplement;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {


    public static List<Product> readDataFromFile(String path) {
        List<Product> productList = new ArrayList<>();
        try {
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            productList = (List<Product>) ois.readObject();
            ois.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return productList;
    }

    public static void main(String[] args) {
        ProductServiceImplement productService = new ProductServiceImplement();
//        productService.firstAdd();
//        productService.writeToFile();
        int select;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("***** Product Menu *****");
            System.out.println("1. Add new product");
            System.out.println("2. Display menu list");
            System.out.println("3. Search a product");
            System.out.println("9. Exit");
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    productService.addProduct();
                    productService.writeToFile();
                    break;
                case 2:
                    try {
                        List<Product> products = new ArrayList<>();
                        products = productService.readFromFile();
                        for (Product product : products) {
                            System.out.println(product);
                        }
                    } catch (Exception e) {
                        System.out.println("File lỗi");
                    }

                    break;
                case 3:
                    productService.searchProduct();
                    break;
                case 9:
                    break;
            }
        } while (select != 9);
    }
}
