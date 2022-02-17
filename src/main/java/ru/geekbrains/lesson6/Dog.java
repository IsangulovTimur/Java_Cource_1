package ru.geekbrains.lesson6;

public class Dog extends Animal{
    private static int count = 0;
    private final int RUN_DISTANCE = 500;
    private final int SWIM_DISTANCE = 10;

    public Dog(String name) {
        super(name);
        count++;
    }

    @Override
    public void run(int distance) {
        if (distance <= RUN_DISTANCE) {
            System.out.printf("Собака побежала %d метров %n",distance);
        } else {
            System.out.printf("Собака не может побежать %d метров %n",distance);
        }
    }

    @Override
    public void swim(int distance) {
        if (distance <= SWIM_DISTANCE) {
            System.out.printf("Собака проплыла %d метров %n",distance);
        } else {
            System.out.printf("Собака не может проплыть %d метров %n",distance);
        }
    }

    public static int getCount() {
        return count;
    }
}
