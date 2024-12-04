package queues;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueExample {
    public static void main(String[] args) {
        PriorityQueue<Integer> line = new PriorityQueue<Integer>();
        line.add(22);
        line.add(19);
        line.add(45);
        System.out.println(line);
        System.out.println(line.remove());
        line.add(204);
        line.add(5);
        line.add(39);
        System.out.println(line.peek());
        System.out.println(line.remove());
        System.out.println(line);

    }
}
