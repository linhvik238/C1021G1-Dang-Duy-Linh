package lesson6.inheritance.practice;

import lesson7.abstraction.exercise.Colorable;
import lesson7.abstraction.exercise.Resizeable;

public class Square extends Rectangle implements Resizeable, Colorable {
    double side = 1;
    public Square(){
    }

    public Square(double side) {
        super(side, side);
    }

    public Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
    }

    public double getSide() {
        return getWidth();
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
    }

    @Override
    public String toString() {
        return  "A Square with side = "
                + getSide()
                + ", which is a subclass of "
                + super.toString();
    }
    @Override
    public void resize (double percent) {
        this.side = this.side * percent / 100;
    }

    @Override
    public void howToColor() {
        System.out.println("Color all four sides");
    }
}
