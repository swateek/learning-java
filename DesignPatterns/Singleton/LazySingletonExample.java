package DesignPatterns.Singleton;

final class LazySingleton {
    private static volatile LazySingleton instance = null;
    // be sure to use “volatile” keyword with instance variable otherwise you can run into an out of order write error scenario, where reference of an instance is returned before actually the object is constructed i.e. JVM has only allocated the memory and constructor code is still not executed. In this case, your other thread, which refers to the uninitialized object may throw null pointer exception and can even crash the whole application.

    // private constructor
    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }
}

public class LazySingletonExample {
    public static void main(String[] args) {
        LazySingleton ls1 = LazySingleton.getInstance();
        LazySingleton ls2 = LazySingleton.getInstance();

        System.out.println(ls1 == ls2); // true. Singleton!
    }
}