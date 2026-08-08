class MyEmployee{
    int id;
    String name;
    public MyEmployee(){
        id=45;
        name="Ashwini";

    }

    public MyEmployee(int i,String Name){
        id = i;
        name = Name;
    }

    void display(){
        System.out.println(id);
        System.out.println(name);

    }


}

public class constructorWithOverloading {
    public static void main(String[] args){
        MyEmployee e1=new MyEmployee();
        MyEmployee e2=new MyEmployee(12,"Ash");

        e1.display();
        e2 .display();
    }

    
}
