package lesson12_java_collection_framework.practice;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Hoàng", 23, "Hà Nội");
        Student student2 = new Student("Thuận", 18, "Đà Nẵng");
        Student student3 = new Student("Bảo", 21, "Huế");
        Student student4 = new Student("Đạt", 16, "Sài Gòn");

        Map<Integer, Student> studentMap = new HashMap<Integer, Student>();
        studentMap.put(1, student1);
        studentMap.put(2, student2);
        studentMap.put(3, student3);
        studentMap.put(4, student4);
        for (Map.Entry<Integer, Student> student : studentMap.entrySet()) {
            System.out.println(student.toString());
        }

        System.out.println("----Set----");
        Set<Student> students = new HashSet<Student>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        students.add(student4);
        students.add(student1);
        for(Student student : students) {
            System.out.println(student.toString());
        }
        System.out.println("----Student List----");
        List<Student> studentList = new ArrayList<Student>();
        studentList.add(student1);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);
        Collections.sort(studentList);
        for (Student st : studentList) {
            System.out.println(st.toString());
        }

        AgeComparator ageComparator = new AgeComparator();
        Collections.sort(studentList, ageComparator);
        System.out.println("Age comparison");
        for (Student st : studentList) {
            System.out.println(st.toString());
        }
    }
}
