package DesignPatterns.Singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class DemoSingleton implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private volatile static DemoSingleton instance = null;

    private DemoSingleton() {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public static DemoSingleton getInstance() {
        if (instance == null) {
            instance = new DemoSingleton();
        }
        return instance;
    }

    private int i = 10;

    protected Object readResolve() {
        return instance;
    }
}

public class SerializationNSingleton {
    static DemoSingleton instanceOne = DemoSingleton.getInstance();

    public static void main(String[] args) {
        try{
            // Serialize to a file
            ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
            out.writeObject(instanceOne);
            out.close();
            instanceOne.setI(20);

            // Deserialize
            ObjectInput in = new ObjectInputStream(new FileInputStream("filename.ser"));
            DemoSingleton instanceTwo = (DemoSingleton) in.readObject();
            in.close();

            System.out.println(instanceOne.getI()); // 20 (before adding readResolve), 20 (after adding readResolve)
            System.out.println(instanceTwo.getI()); // 10 (before adding readResolve), 20 (after adding readResolve)

            // We get different values for i. Thus, there are two instances of the class. Not singleton anymore.
            // we need to include a readResolve() method in our DemoSingleton class. This method will be invoked when you will de-serialize the object. 
            // Inside of this method, you must return the existing instance to ensure a single instance application wide.
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}