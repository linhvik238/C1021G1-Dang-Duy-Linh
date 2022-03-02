package lesson17_IO_binary_file_serialization.practice.p2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static final String FILE_Student = "C:\\Users\\Admin\\Desktop\\Code Gym\\Module 2\\src\\lesson17_IO_binary_file_serialization\\practice\\p2\\student.txt";

    public static void writeToFile(String path, List<Student> students) {
        try {
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(students);
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

        public static List<Student> readDataFromFile (String path) {
            List<Student> students1 = new ArrayList<>();
            try {
                FileInputStream fis = new FileInputStream(path);
                ObjectInputStream ois = new ObjectInputStream(fis);
                students1 = (List<Student>) ois.readObject();
                ois.close();
            } catch (Exception e) {
                e.printStackTrace();
        }
            return students1;
    }
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(1, "Bảo", "Đà Nẵng"));
        students.add(new Student(2, "Hoàng", "Bình Định"));
        students.add(new Student(3, "Thuận", "Quảng Nam"));
        students.add(new Student(4, "Đạt", "Quảng Trị"));
        students.add(new Student(5, "Linh", "Đà Nẵng"));
        students.add(new Student(6, "Hiếu", "Hội An"));
        writeToFile(FILE_Student, students);
        List<Student> studentDataFromFile = readDataFromFile(FILE_Student);
        for (Student student : studentDataFromFile) {
            System.out.println(student);
        }
    }
}
