class thr1 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            try{
                thr1.sleep(100);
            }
            catch(InterruptedException e){
                System.out.println(e);

            }
            System.out.println("Thread 1 is running");
            i+=1;
        }  
    }
}
class thr2 extends Thread{
    public void run(){
        int i=0;
        while(i<50){
            System.out.println("Thread 2 is running");
            i+=1;
        }  
    }
}

public class ThreadMethods {

    public static void main(String[] args){
        
        thr1 t1=new thr1();
        thr2 t2=new thr2();
        // t2.setPriority(t2.MAX_PRIORITY);
        t1.start();
        // try{
        //     t1.join();
        // }
        // catch(Exception e){
        //     System.err.println(e);

        // }
        t2.start();
    }
}
