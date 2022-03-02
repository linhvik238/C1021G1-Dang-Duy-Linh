package lesson5.access_modifier_static_method.exercise;

public class Test {
    public static void main(String[] args) {
        Student student1 = new Student ();
        student1.setName("Linh");
        student1.setClasses("C10");
        System.out.println("Student's name: " + student1.getName());
        System.out.println("Student's class: " + student1.getClasses());
    }
}
