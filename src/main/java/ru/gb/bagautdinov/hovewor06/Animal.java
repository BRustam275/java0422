package ru.gb.bagautdinov.hovewor06;

public class Animal {
    private String name;
    private int run;
    private int toSail;

    public Animal(String name, int run, int toSail) {
        this.name = name;
        this.run = run;
        this.toSail = toSail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRun() {
        return run;
    }

    public void setRun(int run) {
        this.run = run;
    }

    public int getToSail() {
        return toSail;
    }

    public void setToSail(int toSail) {
        this.toSail = toSail;
    }

    public void print() {
        System.out.println();

    }
}
