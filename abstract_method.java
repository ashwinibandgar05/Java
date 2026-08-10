abstract class Animal{
    abstract public void sound();
    public void base(){
        System.out.println("This is abstract parent class with abstract method ");
    }


    //Constructor of parent class

    Animal (){
        System.out.println("I am a cnstructor of animal class.");

    }


}
//We can also make this class as abstract 

class Dog extends Animal{

    @Override
    public void sound(){
        System.out.println("The sound of Dog is Barks.");
    }
}



public class abstract_method {
    public static void main(String[] args){

      //Animal a=new Animal();--Error through


        Animal a=new Dog();
        a.sound();
    }
    
}
