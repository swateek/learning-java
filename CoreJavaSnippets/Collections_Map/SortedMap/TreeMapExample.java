package CoreJavaSnippets.Collections_Map.SortedMap;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
    // map is sorted according to the natural ordering of its keys, 
    // or by a Comparator provided at map creation time, depending on which constructor is used.

    public static void main(String[] args) {
        Map<Integer, String> tree_map = new TreeMap<Integer, String>();

        tree_map.put(0, "Berhampur");
        tree_map.put(1, "Cuttack");
        tree_map.put(2, "Bangalore");

        System.out.println(tree_map); // {0=Berhampur, 1=Cuttack, 2=Bangalore}
    }
}