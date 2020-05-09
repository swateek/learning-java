package CoreJavaSnippets.Collections.Queue;

import java.util.PriorityQueue;

public class PriorityQ {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i=0; i<=5; i++){
            pq.add(i);
        }
        
        System.out.println(pq);
        System.out.println(pq.peek()); // retrieves head of PriorityQueue but doesn't remove
        System.out.println(pq);
        System.out.println(pq.poll()); // removes head of PriorityQueue
        System.out.println(pq);
        System.out.println(pq.remove(3)); // removes element from PriorityQueue
        System.out.println(pq);
    }
}