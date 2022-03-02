package lesson7.abstraction.exercise;

import lesson6.inheritance.practice.Circle;
import lesson6.inheritance.practice.Rectangle;
import lesson6.inheritance.practice.Shape;
import lesson6.inheritance.practice.Square;

public class ColorableTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape [3];
        shapes[0] = new Square(2, "yellow", false);
        shapes[1] = new Circle(2, "white", true);
        shapes[2] = new Rectangle(5.5, 3.4);
        for (Shape shape : shapes) {
            System.out.println(shape);
            if (shape instanceof Colorable)
                ((Colorable) shape).howToColor();
        }
    }
}
