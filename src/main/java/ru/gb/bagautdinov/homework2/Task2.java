package ru.gb.bagautdinov.homework2;

public class Task2 {
    public static void main(String[] args) {
        isTheNumberPositive();
    }
    public static void isTheNumberPositive(){
        int a = 2;
        if (a >= 0){
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}
