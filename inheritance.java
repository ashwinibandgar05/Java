class Base{
    int x;
    public int getX(){
        return x;
    }
    public  void setX(int x){
        System.out.println("I am in base calss and I am setting the value of x.");
        this.x=x;
    }

    public void printMe(){
        System.out.println("I am a constructor");
    }
    
}

class derived extends Base{
    int y;
    public int getY(){

        return y;
    }

    public void setY(int y){
        System.out.println("I am in child class and setting the value of Y");
        this.y=y;
    }


}


public class inheritance{
    public static void main (String[] args){

        //creating an object of the base class
        Base b=new Base();
        b.setX(9);
        System.out.println(b.getX());



        //creating object of derived class
        derived d=new derived();
        d.setX(43);
        System.out.println(d.getX());

    }
}