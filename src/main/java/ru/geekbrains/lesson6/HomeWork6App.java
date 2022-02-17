package ru.geekbrains.lesson6;

public class HomeWork6App {
    public static void main(String[] args) {
        Cat firstCat = new Cat("Barsik");
        Cat secondCat = new Cat("Rizhik");
        Dog firstDog = new Dog("Sharik");
        Dog secondDog = new Dog("Polkan");
        Dog thirdDog = new Dog("Bruno");
        Dog fourthDog = new Dog("Kashtanka");
        Dog fifthDog = new Dog("Rupert");

        firstCat.run(150);
        firstCat.swim(10);
        secondCat.run(300);
        secondCat.swim(20);
        firstDog.run(500);
        firstDog.swim(20);
        secondDog.run(600);
        secondDog.swim(10);

        System.out.println("Cats: " + Cat.getCount());
        System.out.println("Dogs: " + Dog.getCount());
        System.out.println("Animals: " + Animal.getCount());
    }
}
