package ru.gb.bagautdinov.homework7;

public class Cat {
    private String name;
    private int appetite;
    private boolean theCatIsFed;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.theCatIsFed = false;
    }

    public void eat(Plate p){
        if (p.getFood() >= appetite) {
            p.decreaseFood(appetite);
            theCatIsFed = true;
        }

    }

    public int getAppetite() {
        return appetite;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("name='").append(name).append('\'');
        sb.append(", appetite=").append(appetite);
        sb.append(", theCatIsFed=").append(theCatIsFed);
        sb.append('}').append(" - поел.");
        return sb.toString();
    }
}
