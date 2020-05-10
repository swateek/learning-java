package DesignPatterns.Singleton;

class StaticBlockSingleton {
    private static final StaticBlockSingleton instance;

    private StaticBlockSingleton(){
    }

    static {
        try{
            instance = new StaticBlockSingleton();
        }catch(Exception e){
            throw new RuntimeException("Something went wrong!", e);
        }
    }

    public static StaticBlockSingleton getInstance(){
        return instance;
    }
}

@SuppressWarnings("unused")
public class StaticBlockSingletonExample {
    public static void main(String[] args) {
        StaticBlockSingleton sbs = StaticBlockSingleton.getInstance();

        // this has a drawback.
        // Suppose there are 5 static fields in a class and the application code needs to access only 2 or 3, for which instance creation is not required at all. If we use this static initialization, we will have one instance created though it is required or not.
    }
}