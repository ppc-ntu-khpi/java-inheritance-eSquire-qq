package domain;

public class Dog extends Predator {

    private String kind;

    public Dog(String name, int weight, String kind) {
        this.name = name;
        this.weight = weight;
        this.kind = kind;
    }
    

public Dog() {
        
        this("Brooklyn",7,"Doberman");
    }

    public Dog (String name) {
        this(name,7,"Doberman");
    }
    
    public void play() {
        System.out.println("Dog is playing...");
    }

    @Override
    public String toString() {
        return super.toString() + "\nKind:\t" + this.kind + "\nThis is a dog !";
    }

    @Override
    public void speak() {
        System.out.println("Bark"); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void eat() {
        System.out.println("Dog eat meat..."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void Animal() {
        super.Animal(); //To change body of generated methods, choose Tools | Templates.
    }
}
