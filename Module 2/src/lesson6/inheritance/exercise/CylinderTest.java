package lesson6.inheritance.exercise;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);

        cylinder = new Cylinder (2.3);
        System.out.println(cylinder);

        cylinder = new Cylinder(3.2, 5.4, "Grey");
        System.out.println(cylinder);
    }
}
