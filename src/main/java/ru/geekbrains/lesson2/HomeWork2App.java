package ru.geekbrains.lesson2;

public class HomeWork2App {
    public static void main(String[] args) {
        System.out.println(summTenTwety(50,10));
        positiveOrNegative(-11);
        System.out.println(isNegative(-1));
        printWordNumbers("тест", 5);
        System.out.println(isLeapYear(1096));
    // 1. Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false.
    }
    public static boolean summTenTwety (int a,int b)
    {
        int sum = a + b;
        return ((sum >= 10) && (sum <=20));
    }
   // 2. Написать метод, которому в качестве параметра передается целое число, метод должен напечатать в консоль, положительное ли число передали или отрицательное. Замечание: ноль считаем положительным числом.
    public static void positiveOrNegative(int input)
    {
        if (input >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }
    // 3. Написать метод, которому в качестве параметра передается целое число. Метод должен вернуть true, если число отрицательное, и вернуть false если положительное.
    public static boolean isNegative (int input) {
        return (input < 0);
    }
    // 4. Написать метод, которому в качестве аргументов передается строка и число, метод должен отпечатать в консоль указанную строку, указанное количество раз;
    public static void printWordNumbers (String word, int num){
        for (int i = 0; i < num; i++) {
            System.out.println(word);
        }
    }
    // 5. Написать метод, который определяет, является ли год високосным, и возвращает boolean (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме каждого 100-го, при этом каждый 400-й – високосный.
    public static boolean isLeapYear(int year){
        return (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0));
    }
}
