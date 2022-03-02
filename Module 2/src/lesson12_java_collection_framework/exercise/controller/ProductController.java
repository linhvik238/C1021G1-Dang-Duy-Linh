package lesson12_java_collection_framework.exercise.controller;

import lesson12_java_collection_framework.exercise.model.Product;
import lesson12_java_collection_framework.exercise.service.ProductService;
import lesson12_java_collection_framework.exercise.service.implement.ProductServiceImplement;

import java.util.Scanner;

public class ProductController {
    public static void main(String[] args) {
        int select = 0;
        ProductServiceImplement productService = new ProductServiceImplement();


        do {
            System.out.println("---- Menu ----");
            System.out.println("1. Add new product");
            System.out.println("2. Edit product");
            System.out.println("3. Remove product");
            System.out.println("4. Display product list");
            System.out.println("5. Search product");
            System.out.println("6. Sort product list");
            System.out.println("9. Exit");
            Scanner scanner = new Scanner(System.in);
            select = Integer.parseInt(scanner.nextLine());

            switch (select) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.editProduct();
                    break;
                case 4:
                    productService.displayProductList();
                    break;
            }
        } while (select != 9);
    }
}
