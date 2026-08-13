// Add a sleep method in welcome thread of quetions to delay  its execution for 200ms


class thr1 extends Thread{
    public void run(){
        while(true){
            try{
                thr1.sleep(200);

            }
            catch(Exception e){
                System.out.println(e);

            }
            System.out.println("Welcome");
        }
    }
}
class thr2 extends Thread{
    public void run(){
        while(true){
            try{
                thr1.sleep(200);

            }
            catch(Exception e){
                System.out.println(e);

            }
            System.out.println("Good Morning!!!");
        }
    }
}

public class Practice_thread {
    public static void main(String[] args){
        thr1 t1=new thr1();
        thr2 t2 =new thr2();
        t1.start();
        t2.start();

    }
    
}
