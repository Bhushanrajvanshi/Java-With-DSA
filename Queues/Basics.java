package Queues;

import java.util.*;

class Basics {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        
        System.out.println(q.isEmpty());
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(5);
        q.offer(15);
        q.offer(25);
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println( q.element());
        System.out.println(q);
        System.out.println("Size of queue is: "+q.size());
        System.out.println(q.poll());
        System.out.println(q.remove());
        System.out.println(q);
        System.out.println("Size of queue is: "+q.size());
        System.out.println(q.isEmpty());
    }
}