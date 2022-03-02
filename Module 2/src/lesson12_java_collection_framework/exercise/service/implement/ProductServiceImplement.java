package lesson12_java_collection_framework.exercise.service.implement;

import lesson12_java_collection_framework.exercise.model.Product;
import lesson12_java_collection_framework.exercise.service.ProductService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductServiceImplement implements ProductService {
    List<Product> productList = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void add() {
        System.out.println("Please input id of the product");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Please input name of the product");
        String name = scanner.nextLine();
        System.out.println("Please input price of the product");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Please input quantity of the product");
        int quantity = Integer.parseInt(scanner.nextLine());

        Product product1 = new Product(id, name, price, quantity);
        productList.add(product1);
    }

    public void displayProductList() {
        for (Product product2 : productList) {
            System.out.println(product2.toString());
        }
    }

    public void editProduct() {
        System.out.println("Please enter the id of product you wanna edit");
        boolean check = false;
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.size(); i++) {
            if (id == productList.get(i).getId()) {
                System.out.println("Please input new name for the product");
                String name = scanner.nextLine();
                System.out.println("Please input new price for the product");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Please input new quantity for the product");
                int quantity = Integer.parseInt(scanner.nextLine());
                productList.get(i).setName(name);
                productList.get(i).setPrice(price);
                productList.get(i).setQuantity(quantity);
                check = true;
                break;
            }
        }
        if (check == false) {
            System.out.println("Product not exist in the list");
        }
    }
}
