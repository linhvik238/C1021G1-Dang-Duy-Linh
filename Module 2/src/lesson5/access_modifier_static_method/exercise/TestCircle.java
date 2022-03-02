package lesson5.access_modifier_static_method.exercise;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle (2);
        System.out.println("Radius " + circle1.getRadius() );
        System.out.println("Area " + circle1.getArea());
    }
}
