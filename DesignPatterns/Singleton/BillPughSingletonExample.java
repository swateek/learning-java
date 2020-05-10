package DesignPatterns.Singleton;

class BillPughSingleton {
    private BillPughSingleton(){

    }

    private static class LazyHolder {
        private static final BillPughSingleton instance = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return LazyHolder.instance;
    }
}

public class BillPughSingletonExample {
    public static void main(String[] args) {
        
    }
}