package Queue;

import java.util.LinkedList;
import java.util.Queue;

public class QueueMain {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(14);
        queue.add(30);
        System.out.println(queue.peek());

        //Iterate over queue
        while(!queue.isEmpty()){
            System.out.println(queue.remove());
        }
    }
}
