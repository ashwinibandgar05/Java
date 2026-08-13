class MyThread extends Thread {

    // Code executed by the thread
    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println(
                Thread.currentThread().getName() +
                " : " + i
            );

            try {
                Thread.sleep(1000); // Pause for 1 second
            } 
            catch (InterruptedException e) {
                System.out.println("Thread interrupted");
            }
        }
    }
}


public class multithreding_usingThread {
    public static void main(String[] args) {

        // Creating two threads
        MyThread t1 = new MyThread();
        MyThread t2 = new MyThread();

        // Giving names to threads
        t1.setName("Thread-1");
        t2.setName("Thread-2");

        // Starting threads
        t1.start();
        t2.start();

        // Main thread
        System.out.println("Main thread is running");

        try {
            // Wait for both threads to finish
            t1.join();
            t2.join();
        } 
        catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }

        System.out.println("All threads completed");
    }
    
}
