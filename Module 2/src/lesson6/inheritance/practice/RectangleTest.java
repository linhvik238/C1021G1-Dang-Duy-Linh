package lesson6.inheritance.practice;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        System.out.println(rectangle1);

        rectangle1 = new Rectangle(2.5,5.8);
        System.out.println(rectangle1);

        rectangle1 = new Rectangle(2.5,5.8,"orange", true);
        System.out.println(rectangle1);
    }
}
