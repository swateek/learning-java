package CoreJavaSnippets.Collections.List;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

@SuppressWarnings("unused")
public class ArrayListExample {
    public static void main(String[] args) {
        // implements List interface

        List<String> l1 = new ArrayList<String>();
        List<String> l2 = new ArrayList<String>(); // using Generics, post 1.5
        l2.add("Bhubaneswar");
        l2.add("Cuttack");
        l2.add("Berhampur");
        System.out.println(l2);
        l2.remove(0);
        System.out.println(l2);

        ListIterator<String> iterator = l2.listIterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}