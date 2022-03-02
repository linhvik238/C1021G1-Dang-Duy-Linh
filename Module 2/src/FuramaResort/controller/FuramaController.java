package FuramaResort.controller;

import FuramaResort.model.facility.Facility;
import FuramaResort.model.person.Customer;
import FuramaResort.services.implement.CustomerServiceImpl;
import FuramaResort.services.implement.EmployeeServiceImpl;
import FuramaResort.services.implement.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaController {
    public static final String midPlace = "\t\t\t\t\t\t\t\t\t\t\t\t\t ";
    static boolean checkSelect;
    static int select;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        displayMainMenu();
    }

    static void displayMainMenu() {
        int select;

        do {
            checkSelect = false;
            System.out.println(midPlace + " ***** Furama Resort Management Menu *****");
            System.out.println(midPlace + "1. Employee Management");
            System.out.println(midPlace + "2. Customer Management");
            System.out.println(midPlace + "3. Facility Management");
            System.out.println(midPlace + "4. Booking Management");
            System.out.println(midPlace + "5. Promotion Management");
            System.out.println(midPlace + "6. Exit");
            System.out.println();
            System.out.println("--------------------");
            System.out.println(midPlace + "Enter your selection");

            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Only can enter number between 1 to 6");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 6");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }

    static void employeeManagement() {
        EmployeeServiceImpl employee = new EmployeeServiceImpl();
        do {
            System.out.println(midPlace + "1.Display list employees");
            System.out.println(midPlace + "2. Add new people");
            System.out.println(midPlace + "3. Edit employee");
            System.out.println(midPlace + "4. Return main menu");
            System.out.println();
            System.out.println(midPlace + "--------------------");
            System.out.println(midPlace + "Enter your selection");
            checkSelect = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(midPlace + "Only can enter number between 1 to 4");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:
                    employee.displayList();
                    checkSelect = true;
                    continue;
                case 2:
                    employee.addNew();
                    checkSelect = true;
                    continue;
                case 3:
                    employee.edit();
                    checkSelect = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 4");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }

    static void customerManagement() {
        CustomerServiceImpl customer = new CustomerServiceImpl();
        do {
            System.out.println(midPlace + "1.Display list customers");
            System.out.println(midPlace + "2. Add new customers");
            System.out.println(midPlace + "3. Edit customers");
            System.out.println(midPlace + "4. Return main menu");
            System.out.println();
            System.out.println(midPlace + "--------------------");
            System.out.println(midPlace + "Enter your selection");
            checkSelect = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(midPlace + "Only can enter number between 1 to 4");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:
                    customer.displayList();
                    checkSelect = true;
                    continue;
                case 2:
                    customer.addNew();
                    checkSelect = true;
                    continue;
                case 3:
                    customer.edit();
                    checkSelect = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 4");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }

    static void facilityManagement() {
        FacilityServiceImpl facility = new FacilityServiceImpl();
        do {
            System.out.println(midPlace + "1.Display list facility");
            System.out.println(midPlace + "2. Add new facility");
            System.out.println(midPlace + "3. Display list facility maintenance");
            System.out.println(midPlace + "4. Return main menu");
            System.out.println();
            System.out.println(midPlace + "--------------------");
            System.out.println(midPlace + "Enter your selection");
            checkSelect = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(midPlace + "Only can enter number between 1 to 4");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:
                    System.out.println(midPlace + "1. Display Villa List");
                    System.out.println(midPlace + "2. Display House List");
                    System.out.println(midPlace + "3. Display Room List");
                    System.out.println(midPlace + "4. Return to Facility Management Menu");
                    System.out.println();
                    System.out.println(midPlace + "--------------------");
                    System.out.println(midPlace + "Enter your selection");
                    checkSelect = true;
                    try {
                        select = Integer.parseInt(scanner.nextLine());
                    } catch (NumberFormatException e) {
                        System.out.println(midPlace + "Only can enter number between 1 to 4");
                        checkSelect = true;
                        continue;
                    }
                    switch (select) {
                        case 1:
                            facility.displayVilla();
                            continue;
                        case 2:
                            facility.displayHouse();
                            continue;
                        case 3:
                            facility.displayRoom();
                            continue;
                        case 4:
                            facilityManagement();
                            continue;
                        default:
                            System.out.println(midPlace + "Only can enter number between 1 to 4");
                    }
                case 2:
                    do {
                        System.out.println(midPlace + "1. Add new Villa");
                        System.out.println(midPlace + "2. Add new House");
                        System.out.println(midPlace + "3. Add new Room");
                        System.out.println(midPlace + "4. Back to menu");
                        System.out.println(midPlace + "--------------------");
                        System.out.println(midPlace + "Enter your selection");
                        checkSelect = false;
                        try {
                            select = Integer.parseInt(scanner.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println(midPlace + "Only can enter number between 1 to 4");
                            checkSelect = true;
                            continue;
                        }
                        switch (select) {
                            case 1:
                                facility.addNew(1);
                                continue;
                            case 2:
                                facility.addNew(2);
                                continue;
                            case 3:
                                facility.addNew(3);
                                continue;
                            case 4:
                                facilityManagement();
                                continue;
                            default:
                                System.out.println(midPlace + "Only can enter number between 1 to 4");
                        }
                    } while (checkSelect);
                    checkSelect = true;
                    continue;
                case 3:
                    facility.listMaintenance();
                    checkSelect = true;
                    continue;
                case 4:
                    displayMainMenu();
                    break;
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 4");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }

    static void bookingManagement() {
        CustomerServiceImpl customerService = new CustomerServiceImpl();
        FacilityServiceImpl facilityService = new FacilityServiceImpl();
        do {
            System.out.println(midPlace + "1. Add new booking");
            System.out.println(midPlace + "2. Display list booking");
            System.out.println(midPlace + "3. Create new contracts");
            System.out.println(midPlace + "4. Display list contracts");
            System.out.println(midPlace + "5. Edit contracts");
            System.out.println(midPlace + "6. Return main menu");
            System.out.println();
            System.out.println(midPlace + "--------------------");
            System.out.println(midPlace + "Enter your selection");
            checkSelect = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(midPlace + "Only can enter number between 1 to 4");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:


                    checkSelect = true;
                    continue;
                case 2:
                    checkSelect = true;
                    continue;
                case 3:
                    checkSelect = true;
                    continue;
                case 4:
                    checkSelect = true;
                    continue;
                case 5:
                    checkSelect = true;
                    continue;
                case 6:
                    displayMainMenu();
                    break;
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 6");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }

    static void promotionManagement() {
        do {
            System.out.println(midPlace + "1. Display list customers use service");
            System.out.println(midPlace + "2. Display list customers get voucher");
            System.out.println(midPlace + "3. Return main menu");
            System.out.println();
            System.out.println(midPlace + "--------------------");
            System.out.println(midPlace + "Enter your selection");
            checkSelect = false;
            try {
                select = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(midPlace + "Only can enter number between 1 to 3");
                checkSelect = true;
                continue;
            }
            switch (select) {
                case 1:
                    checkSelect = true;
                    continue;
                case 2:
                    checkSelect = true;
                    continue;
                case 3:
                    displayMainMenu();
                    break;
                default:
                    System.out.println(midPlace + "Only can enter number between 1 to 3");
                    checkSelect = true;
                    continue;
            }
        } while (checkSelect);
    }
}
