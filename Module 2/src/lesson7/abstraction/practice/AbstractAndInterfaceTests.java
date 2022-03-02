package lesson7.abstraction.practice;
import lesson7.abstraction.practice.animal.Animal;
import lesson7.abstraction.practice.animal.Chicken;
import lesson7.abstraction.practice.animal.Tiger;
import lesson7.abstraction.practice.edible.Edible;
import lesson7.abstraction.practice.fruit.Fruit;
import lesson7.abstraction.practice.fruit.Apple;
import lesson7.abstraction.practice.fruit.Orange;

public class AbstractAndInterfaceTests {
    public static void main(String[] args) {

        Animal[] animals = new Animal[2];
        animals[0] = new Tiger();
        animals[1] = new Chicken();
        for (Animal animal : animals) {
            System.out.println(animal.makeSound());

            if (animal instanceof Chicken) {
                Edible edibler = (Chicken) animal;
                System.out.println(edibler.howToEat());
            }
        }
        Fruit[] fruits = new Fruit[2];
        fruits[0] = new Orange();
        fruits[1] = new Apple();
        for (Fruit fruit : fruits) {
            System.out.println(fruit.howToEat());
        }
    }
}
