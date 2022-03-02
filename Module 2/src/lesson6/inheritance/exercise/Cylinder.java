package lesson6.inheritance.exercise;

public class Cylinder extends Circle {
    private double height = 11.7;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }
    public Cylinder (double height, double radius, String color) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume () {
        return radius * radius * height * Math.PI;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "radius = " + radius +
                ", height = " + height +
                ", volume = " + getVolume() +
                ", color = " + getColor() +
                '}';
    }
}
