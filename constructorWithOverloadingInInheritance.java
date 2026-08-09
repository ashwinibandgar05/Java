class Animal {

    String name;

    Animal(String name) {
        this.name = name;
        System.out.println("Animal constructor called");
    }

    void eat() {
        System.out.println(name + " is eating");
    }
}


// Child class
class Dog extends Animal {

    int age;

    Dog(String name, int age) {

        // Calling Parent class constructor
        super(name);

        this.age = age;

        System.out.println("Dog constructor called");
    }

    void bark() {
        System.out.println(name + " is barking");
    }
}


// Grandchild class
class Puppy extends Dog {

    String color;

    Puppy(String name, int age, String color) {

        // Calling Child class constructor
        super(name, age);

        this.color = color;

        System.out.println("Puppy constructor called");
    }

    void play() {
        System.out.println(name + " is playing");
    }
}

public class constructorWithOverloadingInInheritance {
    public static void main(String[] args) {

        Puppy p = new Puppy("Tommy", 2, "Brown");

        System.out.println();

        p.eat();       // Parent method
        p.bark();      // Child method
        p.play();      // Grandchild method

        System.out.println("Name: " + p.name);
        System.out.println("Age: " + p.age);
        System.out.println("Color: " + p.color);
    }
    
}
