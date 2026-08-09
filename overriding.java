// Parent class
class Animal {

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class overriding {
    public static void main(String[] args) {

        Dog d = new Dog();

        d.sound();
    }
}
