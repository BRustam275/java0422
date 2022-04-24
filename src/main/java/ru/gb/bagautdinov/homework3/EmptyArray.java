package ru.gb.bagautdinov.homework3;

import java.lang.reflect.Array;
import java.util.Arrays;

public class EmptyArray {
    public static void main(String[] args) {
        empteArray();
//        Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//        значениями 1 2 3 4 5 6 7 8 … 100

    }
    public static void empteArray(){
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = (i + 1);
        }
        System.out.println(Arrays.toString(a));
    }
}
