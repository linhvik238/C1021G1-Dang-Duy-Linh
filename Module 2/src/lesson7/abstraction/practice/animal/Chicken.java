package lesson7.abstraction.practice.animal;

import lesson7.abstraction.practice.animal.Animal;
import lesson7.abstraction.practice.edible.Edible;
public class Chicken extends Animal implements Edible {
    @Override
    public String makeSound() {
        return "Chicken: cluck-cluck!";
    }

    @Override
    public String howToEat() {
        return "could be fried";
    }
}
