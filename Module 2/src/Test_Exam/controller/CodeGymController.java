package Test_Exam.controller;

import Test_Exam.model.Teacher;
import Test_Exam.service.StudentServiceImpl;
import Test_Exam.service.TeacherServiceImpl;

import java.util.Scanner;

public class CodeGymController {
    static StudentServiceImpl studentService = new StudentServiceImpl();
    static TeacherServiceImpl teacherService = new TeacherServiceImpl();
    static Scanner scanner = new Scanner(System.in);
    public static final String arrange = "\t\t\t\t\t\t\t\t\t\t\t\t\t\t";
    static int choice = 0;

    public static void mainMenu() {
        do {
            System.out.println(arrange + " ---- CodeGym Management ----");
            System.out.println(arrange + "1. Add new teacher or student");
            System.out.println(arrange + "2. Delete teacher or student");
            System.out.println(arrange + "3. Display teacher or student list");
            System.out.println(arrange + "4. Search teacher or student");
            System.out.println(arrange + "5. Exit");
        try {
            System.out.println("Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please input only 1 to 5!");
        }
            switch (choice) {
                case 1:
                    addNewMenu();
                    break;
                case 2:
                    deleteMenu();
                    break;
                case 3:
                    displayMenu();
                    break;
                case 4:
                    searchMenu();
                    break;
                case 5:
                    System.exit(0);
            }
        } while (true);
    }

    public static void addNewMenu() {
        do {
            System.out.println(arrange + "----Add Menu----");
            System.out.println("1. Add new teacher");
            System.out.println("2. Add new student");
            System.out.println("3. Return main menu");
        try {
            System.out.println("Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please choose either option 1, 2 or 3!");
        }
            switch (choice) {
                case 1:
                    teacherService.add();
                    break;
                case 2:
                    studentService.add();
                    break;
                case 3:
                    mainMenu();
            }
        } while (true);
    }

    public static void displayMenu() {
        do {
            System.out.println(arrange + "---- Display Menu ----");
            System.out.println(arrange + "1. Teacher list");
            System.out.println(arrange + "2. Student list");
            System.out.println(arrange + "3. Main menu");
        try {
            System.out.println("Please enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please choose either option 1, 2 or 3!");
        }
            switch (choice) {
                case 1:
                    teacherService.display();
                    break;
                case 2:
                    studentService.display();
                    break;
                case 3:
                    mainMenu();
            }
        } while (true);
    }

    public static void deleteMenu() {
        do {
            System.out.println(arrange + "---- Delete Menu ----");
            System.out.println("1. Delete teacher");
            System.out.println("2. Delete student");
            System.out.println("3. Return main menu");
        try {
            System.out.println("Please enter your choice");
            choice = Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Please choose either option 1, 2 or 3!");
        }
            switch (choice) {
                case 1:
                    teacherService.delete();
                    break;
                case 2:
                    studentService.delete();
                    break;
                case 3:
                    mainMenu();
            }
        } while (true);
    }

    public static void searchMenu() {
        System.out.println(arrange + "---- Search Menu ----");
        System.out.println("1. Search teacher");
        System.out.println("2. Search student");
        System.out.println("3. Return main menu");

        System.out.println("Please enter your choice: ");
        choice = Integer.parseInt(scanner.nextLine());

        switch (choice) {
            case 1:
                teacherService.search();
                break;
            case 2:
                studentService.search();
                break;
            case 3:
                mainMenu();
        }
    }

    public static void main(String[] args) {
//        mainMenu();
        Teacher teacher = new Teacher();
        System.out.println(teacher);
        teacher.getName();
    }
}
