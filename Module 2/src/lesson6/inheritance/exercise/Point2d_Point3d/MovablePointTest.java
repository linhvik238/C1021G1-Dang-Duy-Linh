package lesson6.inheritance.exercise.Point2d_Point3d;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePointO = new MovablePoint();
        System.out.println(movablePointO);
        movablePointO = new MovablePoint(2.3f, 11.7f);
        System.out.println(movablePointO);
        movablePointO = new MovablePoint(3.2f, 2.7f, 11.7f, 23.8f);
        System.out.println(movablePointO);
    }
}
