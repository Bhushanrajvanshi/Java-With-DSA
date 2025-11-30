package Queues;

import java.util.*;

public class ReOrderQueue {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        Stack<Integer> st = new Stack<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        q.add(7);
        q.add(8);
        
        System.out.println(q);
        int n = q.size()/2;

        // First step
        for(int i=0; i<n; i++){
            st.push(q.remove());
        }

        // Second step
        while(st.size()>0){
            q.add(st.pop());
        }

        // Third step
        for(int i=0; i<n; i++){
            st.push(q.remove());
        }

        // Fourth step
        while(st.size()>0){
            q.add(st.pop());
            q.add(q.remove());
        }

        while(q.size()>0){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        System.out.println(q);

        // System.out.println(st);

    }
}
