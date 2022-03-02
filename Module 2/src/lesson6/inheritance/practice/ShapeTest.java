package lesson6.inheritance.practice;

public class ShapeTest {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        System.out.println(shape1);

        shape1 = new Shape("red", false);
        System.out.println(shape1);
    }
}
