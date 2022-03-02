package lesson6.inheritance.exercise;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle (23.8);
        System.out.println(circle);

        circle = new Circle (2.3,"Black");
        System.out.println(circle);
    }
}
