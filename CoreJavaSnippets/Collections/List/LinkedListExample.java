package CoreJavaSnippets.Collections.List;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();

        ll.add("Bhubaneswar");
        ll.add("Cuttack");
        ll.addFirst("Berhampur");
        ll.add("Balugaon");
        ll.add("Begunia");
        ll.addLast("Chelligada");
        System.out.println(ll);

        ll.remove("Balugaon");
        ll.remove(3);
        System.out.println(ll);
    }
}