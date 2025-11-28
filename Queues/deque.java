package Queues;
import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> dq = new LinkedList<>();
        dq.addLast(2);
        dq.addLast(3);
        dq.addLast(4);
        dq.addFirst(1);
        System.out.println(dq);
        dq.add(10);   // add element just like a normal queue
        System.out.println(dq);
        dq.remove();   // remove element just like a normal queue
        System.out.println(dq);
        dq.removeLast();  // remove last element
        System.out.println(dq);
        dq.removeFirst();  // remove first element
        System.out.println(dq);
        dq.addLast(5);
        dq.addLast(6);
        dq.addLast(7);
        dq.addLast(5);
        System.out.println(dq);
        // dq.removeFirstOccurrence(5);
        dq.removeLastOccurrence(5);
        System.out.println(dq);
        dq.removeAll(dq);
        System.out.println(dq);
    }
}
