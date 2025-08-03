import java.util.LinkedList;
import java.util.Queue;

public class learnQueue {
    public static void main(String[] args) {
        Queue<Integer> queue= new LinkedList<>();
        queue.offer(36);
        queue.offer(9);
        queue.offer(34);
        queue.offer(48);

        System.out.println(queue);
        queue.poll();// returns the head of the queue remove() throws exception if the queue is empty
        System.out.println(queue);
        System.out.println(queue.peek());// returns and removes the head of the queue element() throws exception if the queue is empty
    }

}
