package CoreJavaSnippets.Collections.Queue.Dequeue;

import java.util.Deque;
import java.util.LinkedList;

public class DequeueExample {
    public static void main(String[] args) {
        // Double ended Queue
        
        Deque<String> deque = new LinkedList<String>();

        deque.add("Bangalore");
        deque.addFirst("Berhampur");
        deque.addLast("Chelligada");
        deque.push("Cuttack");
        deque.offerFirst("Begunia");
        deque.offerLast("Tikarpada");

        System.out.println(deque); // [Begunia, Cuttack, Berhampur, Bangalore, Chelligada, Tikarpada]
    }
}