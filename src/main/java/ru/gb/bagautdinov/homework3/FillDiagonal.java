package ru.gb.bagautdinov.homework3;

import java.util.Arrays;

public class FillDiagonal {
    public static void main(String[] args) {
        int n = 5;
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j){
                    a[i][j] = 1;
                }else {
                    a[i][j] = 0;
                    a[i][n - i -1] = 1;
                }
            }
            System.out.println(Arrays.toString(a[i]));
        }
    }
}
