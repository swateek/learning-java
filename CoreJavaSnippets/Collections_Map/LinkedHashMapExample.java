package CoreJavaSnippets.Collections_Map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    // similar to HashMap but maintains insertion order

    public static void main(String[] args) {
        Map<Integer, String> lhm = new LinkedHashMap<Integer, String>();
        lhm.put(0, "Berhampur");
        lhm.put(1, "Cuttack");
        lhm.put(2, "Bangalore");
        System.out.println(lhm); // {0=Berhampur, 1=Cuttack, 2=Bangalore}
    }
}