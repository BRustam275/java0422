package ru.gb.bagautdinov.homework2;

public class Task5 {
    public static void main(String[] args) {
        System.out.println(highGradeYear(1987));
    }
    public static boolean highGradeYear( int a){
        if (a % 4 == 0){
            return true;
        }else if (a % 100 == 0){
            return false;
        }else if (a % 400 == 0){
            return true;
        }else {
            return false;
        }
    }
}
