package CoreJavaSnippets.Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QLinkedListExample {
    
    public static void main(String[] args) {
        Queue<Integer> qll = new LinkedList<>();

        for(int i=0; i<=5; i++){
            qll.add(i);
        }
        System.out.println(qll);

        int itm = qll.remove();
        System.out.println(qll);
        System.out.println("We just removed: " + itm);

        System.out.println("Current Head is: " + qll.peek());
    }
}