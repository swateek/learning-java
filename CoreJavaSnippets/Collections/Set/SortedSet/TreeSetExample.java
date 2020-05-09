package CoreJavaSnippets.Collections.Set.SortedSet;

import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        // SortedSet extends the Set interface
        // TreeSet implements the SortedSet interface
        // no insertion order, but elements are sorted by keys
        
        TreeSet<String> ts1 = new TreeSet<String>();
        ts1.add("Bangalore");
        ts1.add("San Jose");
        ts1.add("Montreal");
        //ts1.add(null); // you cannot add null. "NullPointer Exception"
        System.out.println(ts1);

        // Won't work.
        // We will get RunTimeException :ClassCastException as StringBuffer does not implements Comparable interface 
        TreeSet<StringBuffer> ts2 = new TreeSet<StringBuffer>();
        ts2.add(new StringBuffer("Europe"));
        ts2.add(new StringBuffer("Asia"));
        ts2.add(new StringBuffer("Africa"));
        ts2.add(new StringBuffer("North America"));
        ts2.add(new StringBuffer("Australia"));
        System.out.println(ts2);
    }
}