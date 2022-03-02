package lesson5.access_modifier_static_method.practice;

public class Car {
    private String name;
    private String engine;

    public static int numberOfCars;

    public Car (String name, String engine){
        this.name = name;
        this.engine = engine;
        numberOfCars++;
    }
}
