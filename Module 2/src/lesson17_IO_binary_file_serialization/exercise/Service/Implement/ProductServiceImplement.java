package lesson17_IO_binary_file_serialization.exercise.Service.Implement;

import lesson17_IO_binary_file_serialization.exercise.Model.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImplement implements ProductService {
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public static final String FILE_PRODUCT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson17_IO_binary_file_serialization\\exercise\\productList.txt";


//    public void firstAdd(){
//        Product product = new Product ();
//        productList.add(product);
//    }
    public void writeToFile() {
        try {
            FileOutputStream fos = new FileOutputStream(FILE_PRODUCT);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(productList);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Product> readFromFile() {
        FileInputStream fis = null;
        List<Product> newProductList = new ArrayList<>();
        try {
            fis = new FileInputStream(FILE_PRODUCT);
            ObjectInputStream ois = new ObjectInputStream(fis);
            newProductList = (List<Product>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("File lỗi");;
        } catch (IOException e) {
            System.out.println("File lỗi");;
        } catch (ClassNotFoundException e) {
            System.out.println("File lỗi");;
        }
        return newProductList;
    }

        public void addProduct () {
            System.out.println("Please input id of the product");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Please input name of the product");
            String name = scanner.nextLine();
            System.out.println("Please input brand of the product");
            String brand = scanner.nextLine();
            System.out.println("Please input double of the product");
            double price = Double.parseDouble(scanner.nextLine());
            System.out.println("Please input color of the product");
            String color = scanner.nextLine();

            Product product = new Product(id, name, brand, price, color);
            productList.add(product);
        }

        public void searchProduct () {
            System.out.println("Enter the product you wanna search: ");
            String searchName = scanner.nextLine();
            boolean check = false;
            for (int i = 0; i < productList.size(); i++) {
                if (searchName.contains(productList.get(i).getName())) {
                    System.out.println(searchName + " is the product you are searching");
                    check = true;
                    break;
                }
            }
            if (!check) {
                System.out.println("The product you are searching is not in the list");
            }
        }
    }
