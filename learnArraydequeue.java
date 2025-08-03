import java.util.ArrayDeque;

public class learnArraydequeue {
    public static void main(String[] args) {
        ArrayDeque<Integer> adq = new ArrayDeque<>();// class under Queue interface
        adq.offer(12);
        adq.offerFirst(34);
        adq.offerLast(27);
        adq.offer(12);

        System.out.println(adq);

        System.out.println(adq.peek());
        System.out.println(adq.peekFirst());
        System.out.println(adq.peekLast());

        System.out.println(adq.poll());
        System.out.println("poll() : "+adq);
        System.out.println(adq.pollFirst());
        System.out.println("pollFirst() : "+adq);
        System.out.println(adq.pollLast());
        System.out.println("pollLast() : "+adq);

    }
}
