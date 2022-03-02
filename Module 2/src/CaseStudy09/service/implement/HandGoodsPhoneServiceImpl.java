package CaseStudy09.service.implement;

import CaseStudy09.model.AuthenticPhone;
import CaseStudy09.model.HandGoodsPhone;
import CaseStudy09.model.Phone;

import java.io.*;
import java.util.*;

public class HandGoodsPhoneServiceImpl implements PhoneService {
    public static final String FILE_HG_PHONE = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\CaseStudy09\\data\\hand_goods_phone.csv";
    static Scanner scanner = new Scanner(System.in);
    static List<HandGoodsPhone> handGoodsPhoneList = new ArrayList<>();
    AuthenticPhoneServiceImpl authenticPhoneService = new AuthenticPhoneServiceImpl();
    List<AuthenticPhone> listAll2 = AuthenticPhoneServiceImpl.authPhoneList;
    List<Phone> listAll = null;
    boolean check;

    @Override
    public void addNewPhone() {
        int price = 0;
        int quantity = 0;
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
        System.out.println("Please enter portable country: ");
        String portableCountry = (scanner.nextLine());
        System.out.println("Please enter status of phone: ");
        String status = scanner.nextLine();

        HandGoodsPhone handGoodPhone = new HandGoodsPhone(name, price, quantity, brand, portableCountry, status);
        handGoodsPhoneList.add(handGoodPhone);
        writeHandGoodPhoneToFile();
    }

    public List<Phone> displayAll() {
        List<AuthenticPhone> listAll2 = AuthenticPhoneServiceImpl.authPhoneList;
        listAll = new ArrayList<>(listAll2);

        listAll.addAll(handGoodsPhoneList);
        listAll.sort(new Comparator<Phone>() {
            @Override
            public int compare(Phone o1, Phone o2) {
                return o1.getId() - o2.getId();
            }
        });
        for (int i = 0; i < listAll.size(); i++) {
            System.out.println(listAll.get(i));
        }
        return listAll;
    }

    @Override
    public void remove() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input id a delete.");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < handGoodsPhoneList.size(); i++) {
            if (handGoodsPhoneList.get(i).getId() == id) {
                System.out.println("Yes or No");
                String choice = scanner.nextLine();
                if (choice.equals("yes")) {
                    handGoodsPhoneList.remove(i);
                    System.out.println("You have successfully delete the phone");
                    writeHandGoodPhoneToFile();
                } else {
                    System.out.println("Delete unsuccessfully.......");
                }
            }
        }
    }

    @Override
    public void display() {
        readHandGoodPhoneFromFile();
        for (HandGoodsPhone a : handGoodsPhoneList) {
            System.out.println(a);
        }
    }


    public void search() {
        check = false;
        System.out.println("Please enter the name of the phone you wanna search: ");
        String name = scanner.nextLine();
        System.out.println("The phone you are looking is: ");
        for (Phone a : listAll) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {

                System.out.println(a);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The phone you are looking for is not in the list");
        }
    }

    public static void writeHandGoodPhoneToFile() {
        FileWriter fw = null;
        BufferedWriter bw = null;

        try {
            fw = new FileWriter(FILE_HG_PHONE);
            bw = new BufferedWriter(fw);
            for (HandGoodsPhone a : handGoodsPhoneList) {
                bw.write(a.getId() + "," + a.getName() + "," + a.getPrice() + "," + a.getQuantity() + "," +
                        a.getBrand() + "," + a.getPortableCountry() + "," + a.getStatus());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<HandGoodsPhone> readHandGoodPhoneFromFile() {
        List<HandGoodsPhone> handGoodsPhoneList = new ArrayList<>();
        try {
            FileReader fr = new FileReader(FILE_HG_PHONE);
            BufferedReader br = new BufferedReader(fr);
            String data = null;
            while ((data = br.readLine()) != null) {
                String[] array = data.split(",");
                HandGoodsPhone handGoodsPhone = new HandGoodsPhone(array[1], Integer.parseInt(array[2]),
                        Integer.parseInt(array[3]), array[4], array[5], array[6]);
                handGoodsPhone.setId(Integer.parseInt(array[0]));
                handGoodsPhoneList.add(handGoodsPhone);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return handGoodsPhoneList;
    }
}
