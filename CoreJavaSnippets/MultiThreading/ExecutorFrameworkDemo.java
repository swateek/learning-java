package CoreJavaSnippets.MultiThreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ExecutorFrameworkDemo {
    
    private static ExecutorService executor = null;
    private static volatile Future taskOneResult = null;
    private static volatile Future taskTwoResult = null;

    private static void checkTasks() throws Exception{
        if(taskOneResult == null || taskOneResult.isDone() || taskOneResult.isCancelled()){
            taskOneResult = executor.submit(new TestOne());
        }

        if(taskTwoResult == null || taskTwoResult.isDone() || taskTwoResult.isCancelled()){
            taskTwoResult = executor.submit(new TestTwo());
        }
    }

    public static void main(String[] args) {
        executor = Executors.newFixedThreadPool(2);
        while(true){
            try{
                checkTasks();
                Thread.sleep(1000);
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
        }
    }
}

class TestOne implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while(true){
            System.out.println(" Executing Task One " + i);
            try{
                Thread.sleep(1000);
                i = i + 1;
                if(i == 5){
                    System.out.println(" i reached breaking point. should restart. Let's create an exception.");
                    int a = 11/0;
                    break;
                }
            }catch(Throwable e){
                e.printStackTrace();
                i = 0;
            }
        }
    }
}

class TestTwo implements Runnable {
    @Override
    public void run() {
        while(true){
            System.out.println(" Executing Task Two ");
            try{
                Thread.sleep(1000);
            }catch(Throwable e){
                e.printStackTrace();
            }
        }
    }
}