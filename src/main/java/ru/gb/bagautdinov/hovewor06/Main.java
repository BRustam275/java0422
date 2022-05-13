package ru.gb.bagautdinov.hovewor06;

import java.util.Random;

/*
1. Создать классы Собака и Кот с наследованием от класса Животное.
 2. Все животные могут бежать и плыть. В качестве параметра каждому методу передается длина препятствия.
  Результатом выполнения действия будет печать в консоль. (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
 3. У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.;
 плавание: кот не умеет плавать, собака 10 м.).
 4. * Добавить подсчет созданных котов, собак и животных.
 */
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
