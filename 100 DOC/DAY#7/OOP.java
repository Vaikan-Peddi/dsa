class Animal {
    static String type = "mammal";

    private int legs;
    private String name;

    Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

}

class Dog extends Animal {
    Dog() {
        super("Tommy", 4);
    }
    void bark() {
        System.out.println("Woof! Woof!");
    }
}

public class OOP {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.bark();
    }
}
