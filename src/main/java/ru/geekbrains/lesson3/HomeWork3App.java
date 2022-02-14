package ru.geekbrains.lesson3;

import java.util.Arrays;

public class HomeWork3App {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(booleanNegateArray(new int[]{ 0, 1, 0, 0, 1, 0, 0, 1}))+ "\n"); // Задание 1
        System.out.println(Arrays.toString(fillUpArray(100))+ "\n"); // Задание 2
        System.out.println(Arrays.toString(doubleIfLess(new int[]{ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1}))+ "\n"); // Задание 3
        fillDiagonals(5); // Задание 4
        int[] arr = fillWithInitialValue(6,9); // Задание 5
        System.out.println(Arrays.toString(arr)); // Задание 5
        minMax(new int []{ 2, 4, 6, 3, 12, 4, 3, 5, 9, 0, -3, -4, 0, -11, 4, 5, 13, 4}); //Задание 6
        System.out.println(checkBalance(new int [] { 2, 2, 2, 1, 2, 2, 10, 1}) + "\n"); // Задание 7
        System.out.println(Arrays.toString(shiftArray(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, 3)) + "\n"); // Задание 8
        System.out.println(Arrays.toString(shiftArray(new int[]{ 1, 2, 3, 4, 5, 6, 7, 8}, -3)) + "\n"); // Задание 8
    }
//    Задание 1. Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] booleanNegateArray(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] == 0) {
                input[i] = 1;
            } else {
                input[i] = 0;
            }
        }
        return input;
    }
//    Задание 2. Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его значениями 1 2 3 4 5 6 7 8 … 100;
    public static int[] fillUpArray(final int length) {
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        return arr;
    }
//    Задание 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] doubleIfLess(final int[] input) {
        for (int i = 0; i < input.length; i++) {
            if (input[i] < 6) {
                input[i] *= 2;
            }
        }
        return input;
    }
// Задание 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами (можно только одну из диагоналей, если обе сложно). Определить элементы одной из диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0], [1][1], [2][2], …, [n][n];
    public static void fillDiagonals(final int size) {
        int[][] arr = new int[size][size];
        for (int i = 0; i < arr.length; i++){
            int rowLength = arr[i].length;
            for (int j =0; j < rowLength; j++) {
                if ((i ==j) || (j == rowLength - 1 - i)) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
//    Задание 5. Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий одномерный массив типа int длиной len, каждая ячейка которого равна initialValue;
    public static int[] fillWithInitialValue(final int len, final int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++){
            arr[i] = initialValue;
        }
        return arr;
    }
//    Задание 6. Задать одномерный массив и найти в нем минимальный и максимальный элементы ;
    public static void minMax(final int[] arr){
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min){
                min = arr[i];
            }
            if (arr[i] > max){
                max = arr[i];
            }
        }
        System.out.println("Минимальное значение из массива:" + min);
        System.out.println("Максимальное значение из массива:" + max);
    }
//    Задание 7. Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean checkBalance (final int[] arr){
        int length = arr.length;
        boolean result = false;
        for (int i = 0; i < length - 1; i++){
            int left = 0;
            int right = 0;
            for (int j = 0; j <= i; j++){
                left += arr[i];
            }
           for (int k = i + 1; k < length; k++){
               right += arr[k];
           }
           if (left == right) {
               result = true;
           }
        }
        return result;
    }
//    Задание 8. Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементы массива на n позиций. Элементы смещаются циклично. Для усложнения задачи нельзя пользоваться вспомогательными массивами. Примеры: [ 1, 2, 3 ] при n = 1 (на один вправо) -> [ 3, 1, 2 ]; [ 3, 5, 6, 1] при n = -2 (на два влево) -> [ 6, 1, 3, 5 ]. При каком n в какую сторону сдвиг можете выбирать сами.
    public static int[] shiftArray(final int[] input, final int shift){
        int [] arr = input.clone();
        if (shift < 0) {
            for (int i = 0; i < Math.abs(shift); i++) {
                int buffer = arr [0];
                for (int j=0; j < arr.length; j++) {
                    if ((j + 1) < arr.length) {
                        arr[j] = arr[j +1];
                    } else {
                        arr[j] = buffer;
                    }
                }
            }
        } else if (shift > 0) {
            for (int j = 0; j < shift; j++) {
                int buffer = arr[arr.length - 1];
                for (int i = arr.length - 1; i > 0; i--) {
                    arr[i] = arr[i-1];
                }
                arr[0] = buffer;
            }
        }
        return arr;
    }
}
