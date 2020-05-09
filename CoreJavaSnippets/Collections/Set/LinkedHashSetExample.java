package CoreJavaSnippets.Collections.Set;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs =  new LinkedHashSet<String>();

        lhs.add("Bhubaneswar");
        lhs.add("Cuttack");
        lhs.add("Berhampur");
        lhs.add("Balugaon");
        lhs.add("Begunia");
        lhs.add("Chelligada");
        System.out.println(lhs);
        
        lhs.remove("Begunia");
        System.out.println(lhs);
    }
}