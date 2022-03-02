package lesson7.abstraction.practice;
import java.util.Comparator;
import lesson6.inheritance.practice.Circle;

public class CircleComparator implements Comparator<Circle> {

    @Override
    public int compare (Circle c1, Circle c2) {
        if (c1.getRadius() > c2.getRadius()) return 1;
        else if (c1.getRadius() < c2.getRadius()) return -1;
        else return 0;
    }
}
