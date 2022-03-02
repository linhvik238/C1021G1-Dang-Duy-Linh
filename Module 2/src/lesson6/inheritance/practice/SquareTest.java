package lesson6.inheritance.practice;

public class SquareTest {
    public static void main(String[] args) {
        Square square1 = new Square();
        System.out.println(square1);

        square1 = new Square (2.3);
        System.out.println(square1);

        square1 = new Square (5.8, "yellow", true);
        System.out.println(square1);
    }
}
