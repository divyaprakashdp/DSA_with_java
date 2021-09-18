package PriorityQueueJava;

import java.util.PriorityQueue;

public class PQImpl {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(909);
        pq.add(-909);
        pq.add(876);
        pq.add(9);
        pq.add(9009);
        pq.add(901119);
        pq.add(-112909);

        System.out.println("Min value in PQ: "+pq.peek());

        System.out.println(pq.remove(9));
        System.out.println("Removed the min value: "+pq.poll());
        System.out.println(pq);

        System.out.println("Now Min value in PQ: "+pq.peek());

    }
}
