package CoreJavaSnippets.MultiThreading;

public class ImplementsRunnable {
    public static void main(String[] args) {
        int n = 8; // number of threads
        for(int i=0; i <= n; i++){
            MultiThreadDemoInt obj = new MultiThreadDemoInt();
            obj.run();
        }
    }
}

class MultiThreadDemoInt implements Runnable{
    @Override
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}