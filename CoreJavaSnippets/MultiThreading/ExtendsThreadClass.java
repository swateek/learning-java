package CoreJavaSnippets.MultiThreading;

public class ExtendsThreadClass {
    public static void main(String[] args) {
        int n = 8; // number of threads
        for(int i=0; i <= n; i++){
            MultiThreadDemo obj = new MultiThreadDemo();
            obj.start();
        }
    }
}

class MultiThreadDemo extends Thread{
    public void run(){
        try{
            System.out.println("Thread " + Thread.currentThread().getId() + " is running");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}