package ru.geekbrains.lesson4;

import java.util.Random;
import java.util.Scanner;
// Задание 1. Полностью разобраться с кодом, попробовать переписать с нуля, стараясь не подглядывать в методичку.
public class HomeWork4App {
    public static char[][] map;
// Задание 3. * Попробовать переписать логику проверки победы, чтобы она работала для поля 5х5 и количества фишек 4. Очень желательно не делать это просто набором условий для каждой из возможных ситуаций;
    public static final int SIZE = 5;
    public static final int DOTS_TO_WIN = 4;
    public static final char DOT_EMPTY = '*';
    public static final char DOT_X = 'X';
    public static final char DOT_O = 'O';
    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();

    public static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }
        }
    }

    public static void printMap(){
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void humanTurn() {
        int x;
        int y;
        do {
            System.out.println("Введите координаты X Y");
            x = scanner.nextInt() - 1;
            y = scanner.nextInt() - 1;
        } while (!isCellValid(x, y));
        map[y][x] = DOT_X;
    }

    public static void aiTurn() {
        int x;
        int y;

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        } while (!isCellValid(x, y));
        System.out.printf("Компьютер выбрал координаты %s %s\n", x + 1, y + 1);
        map[y][x] = DOT_O;
    }

    public static boolean isCellValid(int x, int y) {
        if (x < 0 || x >= SIZE || y < 0 || y >= SIZE){
            return false;
        }
        if (map[y][x] == DOT_EMPTY){
            return true;
        }
        return false;
    }
//    public static boolean checkWin(char symb) {
//        if (map[0][0] == symb && map[0][1] == symb && map[0][2] == symb) return true;
//        if (map[1][0] == symb && map[1][1] == symb && map[1][2] == symb) return true;
//        if (map[2][0] == symb && map[2][1] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][0] == symb && map[2][0] == symb) return true;
//        if (map[0][1] == symb && map[1][1] == symb && map[2][1] == symb) return true;
//        if (map[0][2] == symb && map[1][2] == symb && map[2][2] == symb) return true;
//        if (map[0][0] == symb && map[1][1] == symb && map[2][2] == symb) return true;
//        if (map[2][0] == symb && map[1][1] == symb && map[0][2] == symb) return true;
//        return false;
//    }
//
// Задание 2. Переделать проверку победы, чтобы она не была реализована просто набором условий, например, с использованием циклов.
    public static boolean checkWin(char symb) {
        for (int i = 0; i < SIZE; i++) {
            int row =0;
            int column = 0;
            int mainDiag = 0;
            int subDiag = 0;
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == symb){
                    row++;
                }
                if (map[j][i] == symb){
                    column++;
                }
                if (map[j][j] == symb){
                    mainDiag++;
                }
                if (map[j][SIZE - 1 - j] == symb){
                    subDiag++;
                }
                if (row == DOTS_TO_WIN || column == DOTS_TO_WIN || mainDiag == DOTS_TO_WIN || subDiag == DOTS_TO_WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkWin(DOT_X)) {
                System.out.println("Человек победил!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
            }
            aiTurn();
            printMap();
            if(checkWin(DOT_O)) {
                System.out.println("Компьютер победил!!!");
                break;
            }
            if (isMapFull()) {
                System.out.println("Ничья!");
            }
        }
    }
}
