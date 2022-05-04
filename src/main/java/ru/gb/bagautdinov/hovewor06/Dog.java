package ru.gb.bagautdinov.hovewor06;

public class Dog extends Animal {


    public Dog(String name, int run, int toSail) {
        super(name, run, toSail);
    }

    public void print() {
        System.out.println("Name: " + getName()  + " пробежал: " + getRun() + "м. проплыл: " + getToSail() + "м.");
    }
}
