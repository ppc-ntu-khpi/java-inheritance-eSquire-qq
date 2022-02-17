package test;

import domain.Cat;
import domain.Dog;

public class TestAnimal1 {

    public static void mian(String[] args) {
        Cat cat = new Cat("Thomas");
        System.out.println(cat);
        cat.hunt();
        cat.eat();
        cat.speak();
        cat.play();
        
        Dog Dog = new Dog("Brooklun");
        System.out.println(Dog);
        Dog.eat();
        Dog.play();
        Dog.speak();
        
    }
}
