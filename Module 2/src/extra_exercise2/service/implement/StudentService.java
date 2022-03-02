package extra_exercise2.service.implement;

import extra_exercise2.model.Student;

import java.util.Arrays;
import java.util.Scanner;

public class StudentService implements IStudentService {
    private Student[] students = new Student[93];
    private static Scanner scanner = new Scanner(System.in);
    private static int count = 0;

    @Override
    public void addNewStudent() {
        if (count < students.length) {
            System.out.println("Please enter ID of student");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.println("Please enter name of student");
            String name = scanner.nextLine();
            System.out.println("Please enter date of birth of student");
            String dateOfBirth = scanner.nextLine();
            System.out.println("Please enter the sex of student");
            String sex = scanner.nextLine();
            System.out.println("Please enter class name of student");
            String className = scanner.nextLine();
            System.out.println("Please enter class year of student");
            String classYear = scanner.nextLine();
            Student student = new Student(id, name, dateOfBirth, sex, className, classYear);
            students[count] = student;
            count++;
        } else {
            System.out.println("The list is full, can not add new");
        }
    }

    @Override
    public void getAll() {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
            System.out.println(students[i]);
        }
    }

    @Override
    public void removeById(int id) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else if (students[i].getId() == id) {
                students[i] = null;
                for (int j = i; j < students.length - 1; j++) {
                    students[j] = students[j + 1];
                }
                students[students.length - 1] = null;
                break;
            }
        }
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index > students.length) {
            throw new IllegalArgumentException("Error index: " + index);
        }
        Student student = students[index];
        for (int i = index; i < students.length - 1; i++) {
            students[i] = students[i + 1];
        }
        students[students.length - 1] = null;
        getAll();
    }


    @Override
    public void search(String search) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                continue;
            } else if (check(search) == true) {
                if (students[i].getName().contains(search)) {
                    System.out.println(students[i]);
                }
            } else {
                if (students[i].getId() == Integer.parseInt(search)) {
                    System.out.println(students[i]);
                }
            }
        }
    }


    public boolean check(String search) {
        for (int i = 0; i < search.length(); i++) {
            if (Character.isLetter(search.charAt(i))) {
                return true;
            }
        }
        return false;
    }
    public void sort () {
        Student[] newStudents = new Student [count];
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                break;
            }
                newStudents[i] = students[i];
        }
        Arrays.sort (newStudents);
        for (int i = 0; i < newStudents.length; i++) {
            System.out.println(newStudents[i]);
        }
    }
}