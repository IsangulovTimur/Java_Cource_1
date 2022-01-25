package ru.geekbrains.lesson1;

import java.sql.SQLOutput;

// 1. Первое задание создаем пустой метод
public class HomeWorkApp {
    public static void main(String[] args) {
// 2. Второе задание выполняем вывод 3-х слов вызовом метода printThreeWords ()
        printThreeWords();
        checkSumSign(); // 3-е задание
        printColor(); // 4-е задание
        compareNumbers(); // 5-e задание
    }
    public static void printThreeWords () {
        System.out.println("Orange\nBanana\nApple");
    }
//  3. Третье задание checkSumSign()
    public static void checkSumSign(){
        int a = 5;
        int b = -10;
        int c = a + b;
        if (c >= 0) {
            System.out.println(c + "  cумма положительная");
        } else {
                System.out.println(c + "  cумма отрицательная");
        }
    }
// 4. Четвертое задание printColor()
    public static void printColor() {
        int value = 150;
        if (value <= 0) {
            System.out.println(value + " < 0 , значит КРАСНЫЙ");
        }
        else if (value <= 100){
            System.out.println(value + " от 1 до 100 , значит ЖЕЛТЫЙ");
        } else {
            System.out.println(value + " больше либо равно 101 , значит ЗЕЛЕНЫЙ");
        }
    }
//    5. Пятое задание compareNumbers()
    public static void compareNumbers() {
        int a = 17;
        int b = 8;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
}
}
