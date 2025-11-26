package Queues;

import java.util.*;

public class PrintQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(10);
        q.add(20);
        q.add(30);
        q.offer(15);
        q.offer(25);
        Queue<Integer> q2 = new LinkedList<>();

        while(q.size()>0){
            System.out.print(q.peek()+" ");
            int x = q.remove();
            q2.add(x);
        }

        System.out.println();
        while(q2.size()>0){
            System.out.print(q2.peek()+" ");
            q.add(q2.remove());
        }

        System.out.println();
        System.out.println(q2);
        System.out.println(q);
    }
}
