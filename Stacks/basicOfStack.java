package Stacks;

import java.util.Stack;

public class basicOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        System.out.println(st.isEmpty());
        st.push(10);
        System.out.println(st.isEmpty());
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        System.out.println(st.pop());   // remove the top element and store itself of top element
        System.out.println(st.peek());  // return the top element
        System.out.println(st.search(30));  // return the index of the element
        System.out.println(st);
    }
}
