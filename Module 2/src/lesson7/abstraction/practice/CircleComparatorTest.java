package lesson7.abstraction.practice;

import java.util.Arrays;
import lesson6.inheritance.practice.Circle;
import java.util.Comparator;

public class CircleComparatorTest {
    public static void main(String[] args) {
        Circle[] circles = new Circle[3];
        circles[0] = new Circle (3.6);
        circles[1] = new Circle ();
        circles[2] = new Circle (5.3,"Indigo", false);

        System.out.println("Pre-sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }

        Comparator circleComparator = new CircleComparator();
        Arrays.sort(circles, circleComparator);

        System.out.println("After-sorted: ");
        for (Circle circle : circles) {
            System.out.println(circle);
        }
    }
}
