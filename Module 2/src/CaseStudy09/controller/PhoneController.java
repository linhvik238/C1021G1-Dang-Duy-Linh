package CaseStudy09.controller;

import CaseStudy09.model.AuthenticPhone;
import CaseStudy09.model.HandGoodsPhone;
import CaseStudy09.model.Phone;
import CaseStudy09.service.implement.AuthenticPhoneServiceImpl;
import CaseStudy09.service.implement.HandGoodsPhoneServiceImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PhoneController {
    static AuthenticPhoneServiceImpl authenticPhoneServiceImpl = new AuthenticPhoneServiceImpl();
    static HandGoodsPhoneServiceImpl handGoodPhoneServiceImpl = new HandGoodsPhoneServiceImpl();
    static List<Phone> phoneList = new ArrayList<>();
    static Scanner scanner;
    static int select;
    static boolean check;

    public static void main(String[] args) {
        mainMenu();
    }

    public PhoneController() {
        readAll();
    }

    static void mainMenu() {
        scanner = new Scanner(System.in);
        do {
            check = false;
            System.out.printf("%100s", "--CHƯƠNG TRÌNH QUẢN LÝ ĐIỆN THOẠI--");
            System.out.println();
            System.out.printf("%65s%-100s", "", "Chọn chức năng theo số (để tiếp tục: ");
            System.out.println();
            System.out.printf("%65s%-100s", "", "1. Thêm mới");
            System.out.println();
            System.out.printf("%65s%-100s", "", "2. Xóa");
            System.out.println();
            System.out.printf("%65s%-100s", "", "3. Xem danh sách điện thoại");
            System.out.println();
            System.out.printf("%65s%-100s", "", "4. Tìm kiếm");
            System.out.println();
            System.out.printf("%65s%-100s", "", "5. Thoát");
            System.out.println();
            System.out.printf("%65s%-80s", "", "Chọn chức năng: ");
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
                    delete();
                    check = true;
                    continue;
                case 3:
                    display();
                    check = true;
                    continue;
                case 4:
                    handGoodPhoneServiceImpl.search();
                    check = true;
                    continue;
            }
        } while (check);
    }

    static void addFunc() {
        do {
            System.out.printf("%65s%-100s", "", "Chức năng thêm mới");
            System.out.println();
            System.out.println("1. Điện thoại chính hãng");
            System.out.println("2. Điện thoại xách tay");
            System.out.println("3. Danh sách chính");
            System.out.println();
            System.out.printf("%65s%-80s", "", "Chọn chức năng: ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Please choose either option 1, 2 or 3");
                check = true;
                continue;
            }
            switch (select) {
                case 1:
                    authenticPhoneServiceImpl.addNewPhone();
                    check = true;
                    continue;
                case 2:
                    handGoodPhoneServiceImpl.addNewPhone();
                    check = true;
                    continue;
                case 3:
                    mainMenu();
            }
        } while (check);
    }

    static void display() {
        readAll();
        check = false;
        do {
            System.out.printf("%65s%-100s", "", "Chức năng hiển thị danh sách");
            System.out.println();
            System.out.println("1. Danh sách điện thoại chính hãng");
            System.out.println("2. Danh sách điện thoại xách tay");
            System.out.println("3. Danh sách điện thoại");
            System.out.println("4. Danh sách chính");
            System.out.printf("%65s%-80s", "", "Chọn chức năng: ");
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only can input 1 to 3, please try again!");
                check = true;
                continue;
            }
            switch (select) {
                case 1:
                    authenticPhoneServiceImpl.display();
                    check = true;
                    continue;
                case 2:
                    handGoodPhoneServiceImpl.display();
                    check = true;
                    continue;
                case 3:
                    handGoodPhoneServiceImpl.displayAll();
                    check = true;
                    continue;
                case 4:
                    mainMenu();
                    continue;
                default:
                    System.out.println("Please select either option 1, 2, 3 or 4!");
            }
        } while (check);
    }

    static void delete() {
        check = false;
        do {
            System.out.printf("%65s%-100s", "", "Chức năng xóa điện thoại");
            System.out.println();
            System.out.println("1. Xóa điện thoại chính hãng");
            System.out.println("2. Xóa điện thoại xách tay");
            System.out.println("3. Danh sách chính");
            System.out.printf("%65s%-80s", "", "Chọn chức năng");
            select = Integer.parseInt(scanner.nextLine());
            switch (select) {
                case 1:
                    authenticPhoneServiceImpl.remove();
                    check = true;
                    continue;
                case 2:
                    handGoodPhoneServiceImpl.remove();
                    check = true;
                    continue;
                case 3:
                    mainMenu();
                    continue;
                default:
                    System.out.println("Please select either option 1 or 2!");

            }
        } while (check);
    }

    static void readAll() {
        for (AuthenticPhone a : authenticPhoneServiceImpl.readAuthPhoneFromFile()) {
            phoneList.add(a);
        }
        for (HandGoodsPhone a : handGoodPhoneServiceImpl.readHandGoodPhoneFromFile()) {
            phoneList.add(a);
        }
    }
}
