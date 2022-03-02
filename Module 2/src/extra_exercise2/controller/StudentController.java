package extra_exercise2.controller;
import extra_exercise2.service.implement.IStudentService;
import extra_exercise2.service.implement.StudentService;

import java.util.Arrays;
import java.util.Scanner;
public class StudentController {
    public static void main(String[] args) {
        IStudentService iStudentService = new StudentService();
        Scanner scanner = new Scanner (System.in);
        int choice = 0;
        do {
            System.out.println("*** Student Menu ***");
            System.out.println("1. Add new student");
            System.out.println("2. Remove student by id");
            System.out.println("3. Remove student by index");
            System.out.println("4. Search student");
            System.out.println("5. List all");
            System.out.println("6. Sort list");
            System.out.println("9. Exit");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    iStudentService.addNewStudent();
                    break;
                case 2:
                    System.out.println("Please enter id of student you wanna remove: ");
                    int id = Integer.parseInt(scanner.nextLine());
                    iStudentService.removeById(id);
                    break;
                case 3:
                    System.out.println("Please enter index of student you wanna remove: ");
                    int index = Integer.parseInt(scanner.nextLine());
                    iStudentService.remove(index);
                    break;
                case 4:
                    System.out.println("Please enter the name or id of the student you wanna search");
                    String search = scanner.nextLine();
                    iStudentService.search(search);
                    break;
                case 5:
                    iStudentService.getAll();
                    break;
                case 6:
                    iStudentService.sort();
                    break;
            }
        } while (choice != 9);
    }
}
