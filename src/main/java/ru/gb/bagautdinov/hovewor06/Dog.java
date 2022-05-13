package ru.gb.bagautdinov.hovewor06;

public class Dog extends Animal {
    private static final int RUN_LIMIT = 500;
    private static final int SWIM_LIMIT = 10;
    private static int count;
    public Dog(String name) {
        super(name, RUN_LIMIT, SWIM_LIMIT);
        count++;
    }

    @Override
    public String toString() {
        return "собака по кличке " + getName();
    }

    public static int getCount() {
        return count;
    }
}
