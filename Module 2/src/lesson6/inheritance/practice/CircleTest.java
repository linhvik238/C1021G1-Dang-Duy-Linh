package lesson6.inheritance.practice;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println(circle1);

        circle1 = new Circle(3.5);
        System.out.println(circle1);

        circle1 = new Circle(3.5, "indigo", false);
        System.out.println(circle1);
    }
}
