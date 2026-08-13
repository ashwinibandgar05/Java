class ThreadConstructorDemo {

    public static void main(String[] args) {

        // 1. Thread()
        Thread t1 = new Thread();

        System.out.println("1. Default Constructor");
        System.out.println("Thread Name: " + t1.getName());
        System.out.println("Thread Priority: " + t1.getPriority());


        // 2. Thread(String name)
        Thread t2 = new Thread("MyThread");

        System.out.println("\n2. Thread(String name)");
        System.out.println("Thread Name: " + t2.getName());


        // 3. Thread(Runnable target)
        Runnable task1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running using Runnable");
            }
        };

        Thread t3 = new Thread(task1);

        System.out.println("\n3. Thread(Runnable target)");
        System.out.println("Thread Name: " + t3.getName());

        t3.start();


        // 4. Thread(Runnable target, String name)
        Runnable task2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Task is running in " + Thread.currentThread().getName());
            }
        };

        Thread t4 = new Thread(task2, "StudentThread");

        System.out.println("\n4. Thread(Runnable target, String name)");
        System.out.println("Thread Name: " + t4.getName());

        t4.start();


        // 5. Thread(ThreadGroup group, Runnable target)
        ThreadGroup group = new ThreadGroup("MyThreadGroup");

        Runnable task3 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread running inside ThreadGroup");
            }
        };

        Thread t5 = new Thread(group, task3);

        System.out.println("\n5. Thread(ThreadGroup group, Runnable target)");
        System.out.println("Thread Name: " + t5.getName());
        System.out.println("Thread Group: " + t5.getThreadGroup().getName());

        t5.start();


        // 6. Thread(ThreadGroup group, String name)
        Thread t6 = new Thread(group, "GroupThread");

        System.out.println("\n6. Thread(ThreadGroup group, String name)");
        System.out.println("Thread Name: " + t6.getName());
        System.out.println("Thread Group: " + t6.getThreadGroup().getName());


        // 7. Thread(ThreadGroup group, Runnable target, String name)
        Runnable task4 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Thread with group, task and name is running");
            }
        };

        Thread t7 = new Thread(group, task4, "CompleteThread");

        System.out.println("\n7. Thread(ThreadGroup, Runnable, String)");
        System.out.println("Thread Name: " + t7.getName());
        System.out.println("Thread Group: " + t7.getThreadGroup().getName());

        t7.start();
    }
}
