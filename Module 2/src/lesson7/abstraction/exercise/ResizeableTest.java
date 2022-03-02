package lesson7.abstraction.exercise;

import lesson6.inheritance.practice.Circle;
import lesson6.inheritance.practice.Rectangle;
import lesson6.inheritance.practice.Shape;
import lesson6.inheritance.practice.Square;

public class ResizeableTest {
    public static void main(String[] args) {
        Shape[] array = new Shape[3];
        array[0] = new Circle(1, "blue", true);
        array[1] = new Rectangle(1.2, 2.3, "black", false);
        array[2] = new Square(4.2, "white", true);
        System.out.println("Before: ");
        for (Shape shape : array) {
            System.out.println(shape);
        }

        System.out.println("After:");
        for (Shape shape : array) {
            double percent = Math.random() * 100;
            shape.resize(percent);
            System.out.println(shape);
        }
    }
}
