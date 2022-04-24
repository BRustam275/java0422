package ru.gb.bagautdinov.homework3;

import java.util.Arrays;

//Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//        одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
public class Task5 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(receivesAndTransmits(5, 10)));
    }
    public static int[] receivesAndTransmits(int len, int initialValue){
        int[] a = new int[len];
        for (int i = 0; i < a.length; i++) {
            a[i] = initialValue;
        }
        return a;
    }
}
