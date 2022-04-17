package ru.gb.bagautdinov.homework2;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(checking(5, 8));
    }
    public static boolean checking(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 20) {
            return true;
        } else {
            return false;
        }
    }

}
