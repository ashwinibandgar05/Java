class Student {

    String name;
    int age;

    // Same name as the class name it automatically involke the default valuess
    // 
    // Student() {
    //     name = "Unknown";
    //     age = 0;
    // }/

    // with paratmeter passing method 
    Student(String Name,int Age){
        
        name = Name;
        age = Age;


    }

    

    void display() {
        System.out.println(name);
        System.out.println(age);
    }
}




public class Costructors{
    public static void main(String[] args){
       
        Student s1 = new Student("CodeWithMe",70);
        s1.display();
    }
}





