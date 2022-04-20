package ru.gb.bagautdinov.homework3;

import java.util.Arrays;

public class FillDiagonal {
    public static void main(String[] args) {

        int[][] a = new int[6][6];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (i == j){
                    a[i][j] = 1;
                }else {
                    a[i][j] = 0;
                }
            }
            System.out.println(Arrays.toString(a[i]));
        }

    }
}
