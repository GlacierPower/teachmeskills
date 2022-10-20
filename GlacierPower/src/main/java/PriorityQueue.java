import java.util.Queue;

public class PriorityQueue {
    public static void main(String[] args) {
        Queue queue = new java.util.PriorityQueue();
        queue.offer("Hello");
        queue.offer("Bye");
        queue.offer("With");
        queue.offer("Hello");

        System.out.println(queue);
        queue.poll();
        System.out.println(queue);

    }
}
