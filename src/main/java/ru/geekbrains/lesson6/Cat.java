package ru.geekbrains.lesson6;

public class Cat extends Animal{
    private static int count = 0;
    private final int RUN_DISTANCE = 200;
//    private final int SWIM_DISTANCE = 10;

    public Cat(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_DISTANCE) {
            System.out.printf("Кот побежал %d метров %n",distance);
        } else {
            System.out.printf("Кот не может побежать %d метров %n",distance);
        }
    }

    @Override
    public void swim(int distance) {
        System.out.printf("Кот не умеет плавать%n");
    }

    public static int getCount() {
        return count;
    }
}
