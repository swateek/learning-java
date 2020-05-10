package AdvanceJavaConcepts.JavaConcurrency;

import java.util.concurrent.TimeUnit;

public class ConcurrentThreads {
    public static void main(String[] args) {
        Runnable task = () -> {
            try {
                String name = Thread.currentThread().getName();
                System.out.println("Foo " + name);
                TimeUnit.SECONDS.sleep(1);
                System.out.println("Bar " + name);
            }catch(InterruptedException e) {
                e.printStackTrace();
            }
        };
        
        task.run();
        
        Thread thread = new Thread(task);
        thread.start();

        /*
         * Output from above
            Foo main
            Bar main
            Foo Thread-0
            Bar Thread-0
        */
    }
}