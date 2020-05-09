package CoreJavaSnippets.Collections.Set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {
    public static void main(String[] args) {
        // HashSet implements the Set, Serializable, Cloneable interfaces.
        // the underlying data structure of HashSet is HashTable
        // order of insertion is not guranteed, since object location is based on hashing

        HashSet<String> hset = new HashSet<String>();
        hset.add("Bangalore");
        hset.add("Berhampur");
        hset.add("Bhubaneswar");

        Iterator<String> i = hset.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }

        hset.remove("Bhubaneswar"); 
        System.out.println("List after removing an item: "+hset);
    }
}