package CoreJavaSnippets.Collections_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapExample {
    // Map interface is not a subtype of Collections

    public static void main(String[] args) {
        Map<Integer, String> hm =  new HashMap<Integer, String>();
        hm.put(0, "Berhampur");
        hm.put(1, "Cuttack");
        hm.put(2, "Bangalore");
        System.out.println(hm); // {0=Berhampur, 1=Cuttack, 2=Bangalore}

        Map<Integer, String> chm =  new ConcurrentHashMap<Integer, String>();
        chm.put(0, "Berhampur");
        chm.put(1, "Cuttack");
        chm.put(2, "Bangalore");
        System.out.println(chm); // {0=Berhampur, 1=Cuttack, 2=Bangalore}
    }
}