package ru.gb.bagautdinov.homework4;

import java.util.Random;
import java.util.Scanner;

import static com.sun.deploy.config.OSType.isWin;

public class Lesson4 {

    // константы:
    // Ширина игрового поля
    // высота тгрового поля
    // количество мин
//    public static final int WIDTH = 10;
//    public static final int HEIGHT = 10;
//    public static final int MINES_COUNT = 20;
//
//    public static final int MINE = 1000;
//    public static final int EMPTY = 0;
//    public static final int SELL_CLOSE = 0;
//    public static final int SELL_ = 1;
//    public static final int SELL_FLAG = -1;
//    private static final int CELL_OPEN = ;
//
//    public static void main(String[] args) {
//        plau();
//    }
//
//    public static void plau() {
//        boolean win = true;
//        int[][] board = generateBoard();
//        int[][] moves = new int[HEIGHT][WIDTH];
//        boolean isPassMove = move(board, moves);
//        win = isWin(moves);
//
//    }
//
//    private static boolean isWin(int[][] moves) {
//        int openCell = 0;
//        for (int i = 0; i < HEIGHT; i++) {
//            for (int j = 0; j < WIDTH; j++) {
//                if (moves[i][j] == CELL_OPEN){
//                    return true;
//                }
//            }
//        }
//    }
//
//    private static boolean move(int[][] board, int[][] moves) {
//        Scanner scanner = new Scanner(System.in);
//        printBoard(board, moves);
//        int row, line;
//        while (true){
//            System.out.println("Ваш ход(столбец, строка, номер 1А): ");
//            String move = scanner.nextLine();
//            row = move.charAt(0);
//            line = move.charAt(1);
//            if (row < WIDTH && row >= 0 && line < HEIGHT && line >= 0){
//                break;
//            }
//            System.out.println("Введите значение в пределах игрового поля");
//        }
//        if (board[line][row] != MINE){
//            moves
//        }
//        return false;
//    }
//
//    public static int[][] generateBoard() {
//        int[][] board = new int[HEIGHT][WIDTH];
//        Random random = new Random();
//        int mines = MINES_COUNT;
//        while (mines > EMPTY){
//            int x, y;
//            do {
//                x = random.nextInt(HEIGHT);
//                y = random.nextInt(WIDTH);
//            }while (board[x][y] == MINE);
//            board[x][y] = MINE;
//            mines--;
//        }
//
//        for (int i = 0; i < HEIGHT; i++) {
//            for (int j = 0; j < WIDTH; j++) {
//                if (board[i][j] == MINE){
//                    continue;
//                }
//                int mCount = 0;
//                for (int k = i - 1; k <= i + 1; k++) {
//                    for (int l = j - 1; l <= j + 1; l++) {
//                        if (k < 0 || k >= HEIGHT || l < 0 || l >= WIDTH){
//                            continue;
//                        }
//                        if (board[k][l] == MINE){
//                            mCount++;
//                        }
//                    }
//                }
//            }
//
//        }
//
//        return board;
//    }
//
//    public static void printBoard(int[][] board, int[][] moves) {
//        System.out.print("    ");
//        for (char i = 'A'; i < 'A' + WIDTH; i++) {
//            System.out.print(" " + i);
//        }
//        System.out.println();
//        for (int i = 0; i < HEIGHT; i++) {
//            System.out.printf("%3d", i);
//            for (int j = 0; j < WIDTH; j++) {
//                if (board[i][j] == EMPTY){
//                    System.out.print(" .");
//                }else if (board[i][j] == MINE){
//                    System.out.print(" *");
//                }else {
//                    System.out.printf("%2d", board[i][j]);
//                }
//            }
//            System.out.println();
//
//        }
//    }
}
