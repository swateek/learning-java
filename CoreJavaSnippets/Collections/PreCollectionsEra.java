package CoreJavaSnippets.Collections;

import java.util.Hashtable;
import java.util.Vector;

public class PreCollectionsEra {
   public static void main(String[] args) {
       // Arrays
       int arr[] = new int[] {1, 2, 3, 4};
       System.out.println(arr[0]); 

       // Vectors
       Vector<Integer> v = new Vector<>();
       v.addElement(1);
       v.addElement(2);
       System.out.println(v.elementAt(0));

       // Hashtable
       Hashtable<Integer, String> h = new Hashtable<>();
       h.put(1, "swateek");
       h.put(2, "jena");
       System.out.println(h.get(1));

       // All the above three have different ways of accessing their members, no common interaface between them.
       // This paved the way for the Collections framework.
   } 
}