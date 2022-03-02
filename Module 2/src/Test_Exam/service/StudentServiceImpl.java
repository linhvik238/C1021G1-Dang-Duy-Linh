package Test_Exam.service;

import Test_Exam.model.Student;
import Test_Exam.service.implement.IPersonService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentServiceImpl implements IPersonService {
    public static final String FILE_STUDENT = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\Test_Exam\\data\\student.csv";
    boolean check;
    Scanner scanner = new Scanner(System.in);
    List<Student> studentList = new ArrayList<>();
    final String REGEX_ID = "^[S][V]-[0-9]{4}$";
    final String SEX = "(Male|Female|Other|male|female|other)";

    public StudentServiceImpl() {
        readStudentFromFile();
    }
    @Override
    public void add() {
        String sex;
        String id;
        do {
            System.out.println("Please enter student id: ");
            id = scanner.nextLine();
            if (id.toUpperCase().matches(REGEX_ID)) {
                break;
            } else
                System.out.println("Student id must be in SV-xxxx format with x is number from 0-9!");
        } while (true);
        System.out.println("Please enter student name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter student birthday: ");
        String dayOfBirth = scanner.nextLine();


//        do {
//            check = false;
//            System.out.println("Please enter student sex: ");
//            sex = scanner.nextLine();
//            if (!sex.toLowerCase().equals("male")
//                    && !sex.toLowerCase().equals("female")
//                    && !sex.toLowerCase().equals("other")) {
//                check = true;
//                continue;
//            }
//        } while (check);
        do {
            System.out.println("Please enter student sex: ");
            sex = scanner.nextLine();
            if (sex.matches(SEX)) {
                break;
            } else
                System.out.println("Wrong input (Only input Male, Female or Other), please input again!");
        } while (true);

        System.out.println("Please enter student class name: ");
        String className = scanner.nextLine();
        System.out.println("Please enter student grade: ");
        double grade = Double.parseDouble(scanner.nextLine());
        Student student = new Student(id, name, dayOfBirth, sex, className, grade);
        studentList.add(student);
        writeStudentToFile();
    }

    @Override
    public void display() {
        for (Student a : studentList) {
            System.out.println(a);
        }
    }

    @Override
    public void search() {
        check = false;
        System.out.println("Please input name of student you wanna search: ");
        String name = scanner.nextLine();
        System.out.println("The student you are looking for is: ");
        for (Student a : studentList) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(a);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The student you are looking for is not in the list!");
        }
    }

    @Override   
    public void delete() {
        System.out.println("Please input student id you wanna remove: ");
        String idRemove = scanner.nextLine();
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId().toUpperCase().equals(idRemove.toUpperCase())) {
                System.out.println("Please select YES or NO");
                String confirm = scanner.nextLine();
                if (confirm.toUpperCase().equals("YES")) {
                    studentList.remove(i);
                    display();
                } else {
                    break;
                }
            }
        }
    }

    public void writeStudentToFile() {
        try {
            FileWriter fw = new FileWriter(FILE_STUDENT);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Student a : studentList) {
                bw.write(a.getId() + "," + a.getName() + "," + a.getDayOfBirth() + "," +
                        a.getSex() + "," + a.getClassName() + "," + a.getMark());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readStudentFromFile() {
        studentList.clear();
        try {
            FileReader fr = new FileReader(FILE_STUDENT);
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                String[] array = data.split(",");
                Student student = new Student(array[0], array[1], array[2], array[3], array[4], Double.parseDouble(array[5]));
                studentList.add(student);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

