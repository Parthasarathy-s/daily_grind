package daily_grind;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApp {
    public static void main(String[] args) {
        new QueueApp().testQueue();
    }

    private void testQueue() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(1);
        queue.add(2);

        System.out.println(queue);

//        System.out.println("Peek - " + queue.peek());
        System.out.println("Poll - " + queue.poll());
        System.out.println(queue);
        System.out.println(queue.remove());
        System.out.println(queue);
    }
}
