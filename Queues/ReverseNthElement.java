package Queues;
import java.util.*;

public class ReverseNthElement {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(2);
        q.add(4);
        q.add(6);
        q.add(8);
        q.add(5);
        System.out.println(q);

        Stack<Integer> st = new Stack<>();
        int k = 3;

        for(int i=0; i<k; i++){
            st.push(q.remove());
        }

        while(st.size()>0){
            q.add(st.pop());
        }

        int n = q.size() - k;
        for(int i=0; i<n; i++){
            q.add(q.remove());
        }
        System.out.println(q);

    }
}
