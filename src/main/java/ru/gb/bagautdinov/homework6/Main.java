package ru.gb.bagautdinov.homework6;

import ru.gb.bagautdinov.hovewor06.Animal;
import ru.gb.bagautdinov.hovewor06.Cat;
import ru.gb.bagautdinov.hovewor06.Dog;

import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Animal[] animals = {
                new Cat("Барсик"),
                new Cat("Музка"),
                new Cat("Рыжик"),
                new Dog("Бобик"),
                new Dog("Шарик")
        };

        System.out.println("Животные = " + Animal.getCount());
        System.out.println("Кошек = " + Cat.getCount());
        System.out.println("Собак = " + Dog.getCount());
        Random random = new Random();
        for (Animal anival: animals) {
            anival.run(random.nextInt(500));
            anival.swim(random.nextInt(40));

        }

    }
}
