package DesignPatterns.Singleton;

class EagerSingleton {
    private static volatile EagerSingleton instance = new EagerSingleton();

    // private constructor
    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
}

class DummyA {
    public DummyA(){
        
    }
}

public class EagerSingletonExample {
    public static void main(String[] args){
        DummyA a1Object = new DummyA();
        DummyA a2Object = new DummyA();

        //EagerSingleton es = new EagerSingleton(); // won't work since constructor is private
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();

        System.out.println(a1Object == a2Object); // will be false, since different instance.
        System.out.println(es1 == es2); // true, Singleton!
    }
}