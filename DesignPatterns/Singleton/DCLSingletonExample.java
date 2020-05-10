package DesignPatterns.Singleton;

class DoubleCheckLockSingleton {
    private static volatile DoubleCheckLockSingleton instance = null;

    private DoubleCheckLockSingleton(){

    }

    public static DoubleCheckLockSingleton getInstance(){
        if(instance == null){
            synchronized(DoubleCheckLockSingleton.class){
                instance = new DoubleCheckLockSingleton();
            }
        }
        return instance;
    }
}

public class DCLSingletonExample {
    
}