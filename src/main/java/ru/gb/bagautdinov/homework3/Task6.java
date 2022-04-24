package ru.gb.bagautdinov.homework3;
//* Задать одномерный массив и найти в нем минимальный и максимальный элементы ;

import java.util.Arrays;
import java.util.Random;

public class Task6 {
    public static void main(String[] args) {
        determineTheMaximumAndMinimum();
    }
    public static void determineTheMaximumAndMinimum(){
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        int min = a[0];
        int max = a[a.length - 1];
        System.out.println(min);
        System.out.println(max);
    }
}
