package ru.gb.bagautdinov.homework7;

public class Plate {
    private int food;
    private final int REFILL = 100;


    public Plate(int food) {
        this.food = food;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plate{");
        sb.append("Еды в тарелке: ").append(getFood());
        sb.append('}');
        return sb.toString();
    }

    public void decreaseFood(int n) {
        if (food >= n) {
            food -= n;

        }

    }
    public void increaseFood(){
        food = REFILL;
    }

    public int getFood() {
        return food;
    }
}




