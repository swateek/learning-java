package CoreJavaSnippets.Collections.Queue;

import java.util.concurrent.ArrayBlockingQueue;

public class ArrayBlockingQExample {
    public static void main(String[] args) {
        // Bounded Blocking Queue, backed by an Array. Size is fixed.

        int capacity = 16;

        ArrayBlockingQueue<Integer> abq = new ArrayBlockingQueue<>(capacity);

        for(int i=0; i<=5; i++){
            abq.add(i);
        }

        System.out.println(abq);
        abq.clear();
        System.out.println(abq);
    }
}