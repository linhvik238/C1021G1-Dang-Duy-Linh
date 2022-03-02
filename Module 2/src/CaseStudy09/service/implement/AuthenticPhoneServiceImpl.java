package CaseStudy09.service.implement;

import CaseStudy09.model.AuthenticPhone;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AuthenticPhoneServiceImpl implements PhoneService{
    public static final String FILE_AUTH_PHONE = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\CaseStudy09\\data\\authentic_phone.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<AuthenticPhone> authPhoneList = new ArrayList<>();

    public AuthenticPhoneServiceImpl() {
        readAuthPhoneFromFile();
    }

    @Override
    public void addNewPhone() {
        int price = 0;
        int quantity = 0;
        int warrantyPeriod = 0;
        System.out.println("Please enter name of phone: ");
        String name = scanner.nextLine();
        try {
            System.out.println("Please enter price of phone: ");
            price = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        if (price < 0) {
            System.out.println("Price must greater than 0!");
        }
        try {
            System.out.println("Please enter quantity: ");
            quantity = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        if (quantity < 0) {
            System.out.println("Quantity must greater than 0!");
        }
        System.out.println("Please enter brand of phone: ");
        String brand = scanner.nextLine();
        try {
            System.out.println("Please enter warranty period: ");
            warrantyPeriod = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only number!");
        }
        if (quantity < 0 || quantity > 730) {
            System.out.println("Quantity period must greater than 0 and less than 730 days!");
        }
        System.out.println("Please enter warranty coverage: ");
        String warrantyCoverage = scanner.nextLine();

        AuthenticPhone authPhone = new AuthenticPhone(name, price, quantity, brand, warrantyPeriod, warrantyCoverage);
        authPhoneList.add(authPhone);
        writeAuthPhoneToFile();
    }

    public List<AuthenticPhone> displayPhone() {
        return authPhoneList;
    }
    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id you wanna delete.");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < authPhoneList.size(); i++) {
            if (authPhoneList.get(i).getId() == id) {
                System.out.println("Yes or No");
                String choice = scanner.nextLine();
                if (choice.equals("yes")) {
                    authPhoneList.remove(i);
                    System.out.println("You have successfully delete the phone");
                    writeAuthPhoneToFile();
                } else {
                    System.out.println("Delete unsuccessfully.......");
                }
            }
        }
    }

    @Override
    public void display() {
        for (AuthenticPhone a : authPhoneList) {
            System.out.println(a);
        }
    }

    public static void writeAuthPhoneToFile() {
        FileWriter fw;
        BufferedWriter br;
        try {
            fw = new FileWriter(FILE_AUTH_PHONE);
            br = new BufferedWriter(fw);
            for (AuthenticPhone a : authPhoneList) {
                br.write((a.getId() + "," + a.getName()) + "," +a.getPrice() + "," + a.getQuantity() + "," +
                        a.getBrand() + "," + a.getWarrantyPeriod() + "," + a.getWarrantyCoverage());
                br.newLine();
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<AuthenticPhone> readAuthPhoneFromFile() {
        List<AuthenticPhone> authenticPhoneList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(FILE_AUTH_PHONE);
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                String [] array = data.split(",");
                AuthenticPhone authenticPhone = new AuthenticPhone(array[1], Integer.parseInt(array[2]),
                        Integer.parseInt(array[3]), array[4], Integer.parseInt(array[5]), array[6]);
                authenticPhone.setId(Integer.parseInt(array[0]));
                authenticPhoneList.add(authenticPhone);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return authenticPhoneList;
    }
}
