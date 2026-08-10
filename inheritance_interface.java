interface Animal {

    void eat();
}

interface Dog extends Animal {

    void bark();
}

class MyDog implements Dog {

    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}


public class inheritance_interface {
    public static void main(String[] args) {

        MyDog d = new MyDog();

        d.eat();
        d.bark();
    }
    
}
