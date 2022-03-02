package FuramaResort.services.implement;

import FuramaResort.model.person.Customer;
import FuramaResort.services.IPersonService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements IPersonService {
    public static final String CUSTOMER_FILE = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\FuramaResort\\data\\customerProfile.csv";
    private static List<Customer> customerTypeList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    public CustomerServiceImpl() {
        customerTypeList = readFromFile();
    }

    @Override
    public void edit() {
        String inputID;
        Customer customer = null;
        System.out.println("Please input customer id: ");
        inputID = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < customerTypeList.size(); i++) {
            if (inputID.toUpperCase().equals(customerTypeList.get(i).getId())) {
                String postId = customerTypeList.get(i).getId().substring(3, 6);
                customer = createCustomer();
                String preID = customer.getId().substring(0, 3).toUpperCase();
                customer.setId(preID + postId);
                customerTypeList.set(i, customer);
                check = true;
                break;
            }
        }
        if (!check) {
            System.out.println("Cannot find this id, please try again!");
        }
        writeFile();
    }

    @Override
    public void addNew() {
        Customer customer = createCustomer();
        customerTypeList.add(customer);
        writeFile();
    }

    public void displayList() {
        if (customerTypeList.size() < 1) {
            System.out.println("File is empty, please input new customer!");
        }
        for (Customer list : customerTypeList) {
            System.out.println(list);
        }
    }

    public int random() {
        int random = (int) Math.floor(Math.random() * 10);
        return random;
    }

    public Customer createCustomer() {
        String[] customerType = {"Diamond", "Platinum", "Gold", "Silver", "Member"};
        final String REGEX_EMAIL = "[a-zA-Z][\\w]*@gmail.com";
        final String REGEX_PHONE = "(093|095|097)[0-9]{7}";
        final String REGEX_BIRTHDAY = "[0-9]{1,2}/[0-9]{1,2}/[0-9]{4}";
        final String REGEX_IDENTITY = "[0-9]{12}";
        boolean check = false;
        String id = null;
        String fullName;
        String dayOfBirth;
        String sex;
        String identityCardNo;
        String phoneNo;
        String email;
        String guestType;
        String address;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter full name: ");
        fullName = scanner.nextLine();

        do {
            check = false;
            System.out.println("Enter day of birth (dd/mm/yyyy): ");
            dayOfBirth = scanner.nextLine();
            if (dayOfBirth.matches(REGEX_BIRTHDAY)) {
                String[] dob = dayOfBirth.split("/");
                if ((Integer.parseInt(dob[1])) < 0 || (Integer.parseInt(dob[1])) > 12) {
                    System.out.println("Wrong month format, please enter again!");
                    check = true;
                } else {
                    switch (Integer.parseInt(dob[1])) {
                        case 1:
                        case 3:
                        case 5:
                        case 7:
                        case 8:
                        case 10:
                        case 12:
                            if (Integer.parseInt(dob[0]) < 0 || (Integer.parseInt(dob[0]) > 31)) {
                                System.out.println("Wrong day format, please enter again!");
                                check = true;
                            }
                            break;
                        case 4:
                        case 6:
                        case 9:
                        case 11:
                            if (Integer.parseInt(dob[0]) < 0 || (Integer.parseInt(dob[0]) > 30)) {
                                System.out.println("Wrong day format, please enter again!");
                                check = true;
                            }
                            break;
                        case 2:
                            if (Integer.parseInt(dob[0]) < 0 || (Integer.parseInt(dob[0]) > 28)) {
                                System.out.println("Wrong day format, please enter again!");
                                check = true;
                            }
                            break;
                    }
                }
            }
        } while (check);

        System.out.println("Enter sex: ");
        sex = scanner.nextLine();
        do {
            if (sex.toLowerCase().equals("male") || sex.toLowerCase().equals("female")) {
                break;
            }
            System.out.println("Wrong gender, please enter again!");
        } while (true);
        do {
            System.out.println("Enter identity card number");
            identityCardNo = scanner.nextLine();
            if (identityCardNo.matches(REGEX_IDENTITY)) {
                break;
            }
            System.out.println("Wrong identity number format, please enter again!");
        } while (true);



        do {
            System.out.println("Enter phone number: ");
            phoneNo = scanner.nextLine();
            if (phoneNo.matches(REGEX_PHONE)) {
                break;
            }
            System.out.println("Wrong phone number format, please enter again!");
        } while (true);

        do {
            System.out.println("Enter email: ");
            email = scanner.nextLine();
            if (email.matches(REGEX_EMAIL)) {
                break;
            }
            System.out.println("Wrong email format, please enter again!");
        } while (true);

        loopWhile:
        while (true) {
            System.out.println("Enter guest type: ");
            guestType = scanner.nextLine();
            for (String s : customerType) {
                if (guestType.toLowerCase().equals(s.toLowerCase())) {
                    break loopWhile;
                }
            }
            System.out.println("Wrong guest type format, please enter again!");
        }

        System.out.println("Enter address: ");
        address = scanner.nextLine();

        if (guestType.toLowerCase().equals("diamond")) {
            id = "DIA" + random() + random() + random();
        } else if (guestType.toLowerCase().equals("platinum")) {
            id = "PLA" + random() + random() + random();
        } else if (guestType.toLowerCase().equals("gold")) {
            id = "GOL" + random() + random() + random();
        } else if (guestType.toLowerCase().equals("silver")) {
            id = "SIL" + random() + random() + random();
        } else if (guestType.toLowerCase().equals("member")) {
            id = "MEM" + random() + random() + random();
        }

        Customer customer = new Customer(id, fullName, dayOfBirth, sex, identityCardNo,
                phoneNo, email, guestType, address);
        return customer;
    }

    public void writeFile() {
        File customerProfile = new File(CUSTOMER_FILE);
        try {
            FileWriter fw = new FileWriter(customerProfile);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Customer c : customerTypeList) {
                bw.write(c.getId() + "," + c.getFullName() + "," + c.getDayOfBirth() + ","
                        + c.getSex() + "," + c.getIdentityCardNo() + "," + c.getPhoneNo() + ","
                        + c.getEmail() + "," + c.getGuestType() + "," + c.getAddress());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public List<Customer> readFromFile() {
        List<Customer> dataList = new ArrayList<>();
        File readCustomerProfile = new File(CUSTOMER_FILE);
        FileReader fr = null;
        try {
            fr = new FileReader(readCustomerProfile);
            BufferedReader br = new BufferedReader(fr);
            String data = null;
            while ((data = br.readLine()) != null) {

                String[] dataA = data.split(",");
                Customer customer = new Customer(dataA[0], dataA[1], dataA[2], dataA[3],
                        dataA[4], dataA[5], dataA[6],
                        dataA[7], dataA[8]);
                dataList.add(customer);
            }
            br.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return dataList;
    }
}
