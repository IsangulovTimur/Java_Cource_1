package ru.geekbrains.lesson7;

public class HomeWork7App {
    public static void main(String[] args) {
        Plate plate = new Plate(50);
        Cat[] cats = new Cat[] {
                new Cat("Barsik", 10),
                new Cat("Rizhik", 12),
                new Cat("Matroskin", 14),
                new Cat("Vaska", 7),
                new Cat("Leopold", 9),
        };

        feedCats(cats,plate);
        plate.refill(10);
        feedCats(cats, plate);

    }

    public static void feedCats(Cat[] cats, Plate plate) {
        for (Cat cat : cats) {
            cat.eat(plate);
            cat.info();
        }
        System.out.println();
    }
}
