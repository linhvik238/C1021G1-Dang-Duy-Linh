package FinalExam.controller;

import FinalExam.service.ExportProductServiceImpl;
import FinalExam.service.ImportProductServiceImpl;

import java.util.Scanner;


public class ProductController {

    public static void main(String[] args) {
        mainMenu();
    }

    public static final String arrange = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
    static Scanner scanner;
    static int select;
    static boolean check;
    static int choice;
    static ImportProductServiceImpl importProductService = new ImportProductServiceImpl();
    static ExportProductServiceImpl exportProductService = new ExportProductServiceImpl();

    static void mainMenu() {
        scanner = new Scanner(System.in);
        do {
            check = false;
            System.out.println(arrange + "---CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM---");
            System.out.println();
            System.out.println(arrange + "Chọn chức năng theo số (để tiếp tục: ");
            System.out.println();
            System.out.println(arrange + "1. Thêm mới");
            System.out.println();
            System.out.println(arrange + "2. Xóa");
            System.out.println();
            System.out.println(arrange + "3. Xem danh sách các sản phẩm");
            System.out.println();
            System.out.println(arrange + "4. Tìm kiếm");
            System.out.println();
            System.out.println(arrange + "5. Thoát");
            System.out.println();
            System.out.println(arrange + "Chọn chức năng: ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Cannot input word and negative number, please try again! ");
            }

            switch (select) {
                case 1:
                    addFunc();
                    continue;
                case 2:
                    remove();
                    check = true;
                    continue;
                case 3:
                    display();
                    check = true;
                    continue;
                case 4:
                    searchMenu();
                    check = true;
                    continue;
            }
        } while (check);
    }

    static void addFunc() {
        do {
            System.out.println(arrange + "Chức năng thêm mới sản phẩm");
            System.out.println();
            System.out.println("1. Sản phẩm nhập khẩu");
            System.out.println("2. Sản phẩm xuất khẩu");
            System.out.println("3. Danh sách chính");
            System.out.println();
            System.out.println(arrange + "Chọn chức năng: ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please choose either option 1, 2 or 3");
                check = true;
                continue;
            }
            switch (select) {
                case 1:
                    importProductService.add();
                    check = true;
                    continue;
                case 2:
                    exportProductService.add();
                    check = true;
                    continue;
                case 3:
                    mainMenu();
            }
        } while (check);
    }

    static void display() {
        check = false;
        do {
            System.out.println(arrange + "Chức năng hiển thị danh sách");
            System.out.println();
            System.out.println("1. Danh sách Sản phẩm nhập khẩu");
            System.out.println("2. Danh sách Sản phẩm xuất khẩu");
            System.out.println("3. Danh sách chính");
            System.out.println(arrange + "Chọn chức năng: ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only can input 1 to 3, please try again!");
                check = true;
                continue;
            }
            switch (select) {
                case 1:
                    importProductService.display();
                    check = true;
                    continue;
                case 2:
                    exportProductService.display();
                    check = true;
                    continue;
                case 3:
                    mainMenu();
                    continue;
                default:
                    System.out.println("Please select either option 1, 2, or 3!");
            }
        } while (check);
    }

    static void remove() {
        check = false;
        do {
            System.out.println(arrange + "Chức năng xóa sản phẩm");
            System.out.println();
            System.out.println("1. Xóa sản phẩm nhập khẩu");
            System.out.println("2. Xóa sản phẩm xuất khẩu");
            System.out.println("3. Danh sách chính");
            System.out.println();
            System.out.println(arrange + "Chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    importProductService.remove();
                    check = true;
                    continue;
                case 2:
                    exportProductService.remove();
                    check = true;
                    continue;
                case 3:
                    mainMenu();
                    continue;
                default:
                    System.out.println("Please select either option 1, 2 or 3!");

            }
        } while (check);
    }

    public static void searchMenu() {
        System.out.println(arrange + "---- Search Menu ----");
        System.out.println(arrange + "1. Search Import Product");
        System.out.println(arrange + "2. Search Export Product");
        System.out.println(arrange + "3. Return main menu");

        System.out.println("Please enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                searchMenuImportProduct();
                break;
            case 2:
                searchMenuExportProduct();
                break;
            case 3:
                mainMenu();
        }
    }

    public static void searchMenuImportProduct() {
        System.out.println("---Search Menu for Import Product---");
        System.out.println("1. Search with product code");
        System.out.println("2. Search with product name");
        System.out.println("3. Return search menu");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                importProductService.searchCode();
                break;
            case 2:
                importProductService.searchName();
                break;
            case 3:
                searchMenu();
        }
    }

    public static void searchMenuExportProduct() {
        System.out.println("---Search Menu for Export Product---");
        System.out.println("1. Search with product code");
        System.out.println("2. Search with product name");
        System.out.println("3. Return search menu");
        choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                exportProductService.searchCode();
                break;
            case 2:
                exportProductService.searchName();
                break;
            case 3:
                searchMenu();
        }
    }
}
