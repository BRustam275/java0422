package ru.gb.bagautdinov.homework3;

import java.util.Arrays;
import java.util.Random;

public class ReplacingAnArray {
    public static void main(String[] args) {
        array();
        System.out.println();
        arrayRandom();
    }
    public static void array() {
        int[] a = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
               a[i] = 1;
            } else {
               a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
    public static void arrayRandom() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(2);
            }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                a[i] = 1;
            } else {
               a[i] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}
