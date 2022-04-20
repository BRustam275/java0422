package ru.gb.bagautdinov.homework3;

import java.util.Random;

public class ReplacingAnArray {
    public static void main(String[] args) {
        array();
        System.out.println();
        arrayRandom();
    }
    public static void array() {
        int[] a = {0, 0, 1, 0, 1, 1, 1, 0, 1, 1};
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print("1, ");
            } else {
                System.out.print("0, ");
            }
        }
    }
    public static void arrayRandom() {
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            a[i] = new Random().nextInt(2);
            System.out.print (a[i] + ", ");
        }
        System.out.println();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 0) {
                System.out.print("1, ");
            } else {
                System.out.print("0, ");
            }

        }
    }
}
