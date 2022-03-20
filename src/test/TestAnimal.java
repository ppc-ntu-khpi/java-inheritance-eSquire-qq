package test;

import domain.Cat;

public class TestAnimal {

    public static void mian(String[] args) {
        Cat cat = new Cat("Thomas");
        System.out.println(cat);
        cat.hunt();
        cat.eat();
        cat.speak();
        cat.play();
    }
}
