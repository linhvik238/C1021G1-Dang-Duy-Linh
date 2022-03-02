package lesson5.access_modifier_static_method.exercise;

public class Circle {
    private double radius = 1.0;
    private String color = "red";


    public Circle(){
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    protected double getRadius() {
        return radius;
    }

    protected double getArea() {
        return Math.pow(this.radius, 2) * Math.PI;
    }
}
