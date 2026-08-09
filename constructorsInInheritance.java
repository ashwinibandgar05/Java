class base1{

    base1(){
        System.out.println("I am a base class constructor");
    }
    public int x;
    public int getX(){
        return x;

    }
    public void setX(int x){
        System.out.println("I am in base class and setting the value of x.");
        this.x=x;

    }
}

class derived1 extends base1{
    derived1(){
        System.out.println("I am a derived class constructor");
        
    }
    
    public int y;

    public int getY(){
        return y;
    }

    public void setY(int y){
        this.y=y;
    }
}



public class constructorsInInheritance {
    public static void main(String[] args){
        derived1 d=new derived1();

    }
}
