package domain;

public class Cat extends Predator {

    private String kind;

    public Cat(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }

    public Cat() {
        
        this("Fluffy",7,"cat");
    }

    public Cat(String name) {
        this(name,7,"cat");
    }
    
    public void play() {
        System.out.println("Cat is playing...");
    }

    @Override
    public void hunt() {
        System.out.println("Cat hunting for a mouse..."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\nThis is a cat !";
    }

    @Override
    public void speak() {
        System.out.println("Meow"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        System.out.println("Cat eat meat..."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Animal() {
        super.Animal(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
