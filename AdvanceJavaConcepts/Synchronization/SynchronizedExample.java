package AdvanceJavaConcepts.Synchronization;

class Sender {
    public void send(String msg){
        System.out.println("Sending.. " + msg);
        try{
            Thread.sleep(1000);
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println("Sent! " + msg);
    }
}

class ThreadedSend extends Thread {
    private String msg;
    Sender sender;

    ThreadedSend(String m, Sender obj){
        msg = m;
        sender = obj;
    }

    public void run(){
        synchronized(sender){
            sender.send(msg);
        }
    }
}

public class SynchronizedExample {
    public static void main(String[] args) {
        Sender snd = new Sender();
        ThreadedSend s1 = new ThreadedSend("Hello, ", snd);
        ThreadedSend s2 = new ThreadedSend("Swateek Jena ", snd);
        
        try{
            s1.run();
            s2.run();
        }catch(Exception e){
            System.out.println("Interupted!");
        }

        /** 
         *  Sending.. Hello, 
         *  Sent! Hello, 
         *  Sending.. Swateek Jena 
         *  Sent! Swateek Jena
         */
    }
}