package queues;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        Queue<Integer> line = new LinkedList<Integer>();
        line.add(15);
        line.add(32);
        System.out.println(line);
        line.remove();
        line.add(84);
        line.add(32);
        line.add(54);
        System.out.println(line.peek());
        System.out.println(line.remove());
        System.out.println(line);

    }
}
