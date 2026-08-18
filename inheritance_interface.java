interface AnimalInterfaceEx {
    void eat();
}

interface DogInterfaceEx extends AnimalInterfaceEx {
    void bark();
}

class MyDogInterfaceEx implements DogInterfaceEx {

    public void eat() {
        System.out.println("Dog eats");
    }

    public void bark() {
        System.out.println("Dog barks");
    }
}

public class inheritance_interface {
    public static void main(String[] args) {
        // Updated to use the unique class name
        MyDogInterfaceEx d = new MyDogInterfaceEx();
        d.eat();
        d.bark();
    }
}
