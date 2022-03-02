package Test_Exam.service;

import Test_Exam.model.Teacher;
import Test_Exam.service.implement.IPersonService;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TeacherServiceImpl implements IPersonService {
    public static final String FILE_TEACHER = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\Test_Exam\\data\\teacher.csv";
    boolean check = false;
    List<Teacher> teacherList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    final String REGEX_ID = "^[G][V]-[0-9]{4}$";

    public TeacherServiceImpl () {
        readTeacherFromFile();
    }

    @Override
    public void add() {
        String id;
        String sex= null;
        do {
            System.out.println("Please enter teacher id: ");
            id = scanner.nextLine();
            if (id.toUpperCase().matches(REGEX_ID)) {
                break;
            } else
                System.out.println("Teacher id must be in GV-xxxx format with x is number from 0-9!");
        } while (true);
        System.out.println("Please enter teacher name: ");
        String name = scanner.nextLine();
        System.out.println("Please enter teacher birthday: ");
        String dayOfBirth = scanner.nextLine();
//        do {
//            check = false;
//            System.out.println("Please enter teacher sex: ");
//            sex = scanner.nextLine();
//            if (!sex.toLowerCase().equals("male")
//                    && !sex.toLowerCase().equals("female")
//                    && !sex.toLowerCase().equals("other")) {
//                check = true;
//                continue;
//            }
//        } while (check);

        do {
            check = false;
            System.out.println("Please enter teacher sex: ");
            sex = scanner.nextLine();
            if (!sex.toLowerCase().equals("male")
                    && !sex.toLowerCase().equals("female")
                    && !sex.toLowerCase().equals("other")) {
                check = true;
                continue;
            }
        } while (check);
        System.out.println("Please enter teacher qualification: ");
        String qualification = scanner.nextLine();
        Teacher teacher = new Teacher(id, name, dayOfBirth, sex, qualification);
        teacherList.add(teacher);
        writeTeacherToFile();
    }

    @Override
    public void display() {
        for (Teacher a : teacherList) {
            System.out.println(a);
        }
    }

    @Override
    public void search() {
        check = false;
        System.out.println("Please input name of teacher you wanna search: ");
        String name = scanner.nextLine();
        System.out.println("The teacher you are looking for is: ");
        for (Teacher a : teacherList) {
            if (a.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(a);
                check = true;
            }
        }
        if (!check) {
            System.out.println("The teacher you are looking for is not in the list!");
        }
    }

    @Override
    public void delete() {
        System.out.println("Please input teacher id you wanna remove: ");
        String idRemove = scanner.nextLine();
        for (int i = 0; i < teacherList.size(); i++) {
            if (teacherList.get(i).getId().toUpperCase().equals(idRemove.toUpperCase())) {
                System.out.println("Please select YES or NO");
                String confirm = scanner.nextLine();
                if (confirm.toUpperCase().equals("YES")) {
                    teacherList.remove(i);
                    display();
                } else {
                    break;
                }
            }
        }
    }

    public void writeTeacherToFile() {
        try {
            FileWriter fw = new FileWriter(FILE_TEACHER);
            BufferedWriter bw = new BufferedWriter(fw);
            for (Teacher a : teacherList) {
                bw.write(a.getId() + "," + a.getName() + "," + a.getDayOfBirth() + "," +
                        a.getSex() + "," + a.getQualification());
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void readTeacherFromFile() {
        teacherList.clear();
        try {
            FileReader fr = new FileReader(FILE_TEACHER);
            BufferedReader br = new BufferedReader(fr);
            String data;
            while ((data = br.readLine()) != null) {
                String[] array = data.split(",");
                Teacher teacher = new Teacher(array[0], array[1], array[2], array[3], array[4]);
                teacherList.add(teacher);
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
