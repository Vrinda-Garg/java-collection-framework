import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class learnPriorityQueue {
    public static void main(String[] args) {

        Queue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());// converts the min heap into max heap
        pq.offer(36);
        pq.offer(9);
        pq.offer(34);
        pq.offer(12);
      // implements min heap
        System.out.println(pq);

        pq.poll();
        System.out.println(pq);
        System.out.println(pq.peek());
    }
}
