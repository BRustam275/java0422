package ru.gb.bagautdinov.hovewor06;

public class Cat extends Animal {


    public Cat(String name, int run, int toSail) {
        super(name, run, toSail);
    }


    public void print() {
        System.out.println("Name: " + getName() + " пробежала: " + getRun()+ "м. проплыла:" + getToSail());
    }
}
