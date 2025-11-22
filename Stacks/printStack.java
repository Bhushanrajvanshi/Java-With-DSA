package Stacks;
import java.util.*;

public class printStack {
    public static void printRec(Stack<Integer> st){
        if(st.isEmpty()) return;

        int top = st.pop();
        printRec(st);
        System.out.print(top + " ");
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        printRec(st);

        int n = st.size();
        int[] arr = new int[n];

        // add elements in array,
        for(int i=n-1; i>=0; i--){
            arr[i] = st.pop();
        }

        // print array,
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " "); 
            st.push(arr[i]);
        }

        System.out.println(st);

        
    }
}
