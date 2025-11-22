package Stacks;
import java.util.Stack;

public class copyStackSameOrder {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);

        // here copy stack in different order
        Stack<Integer> st2 = new Stack<>(); 
        while (!st.isEmpty()) {
            st2.push(st.pop());
        }
        System.out.println(st2);

        // here copy stack in same order
        Stack<Integer> copy = new Stack<>();
        while(!st2.isEmpty()) {
            copy.push(st2.pop());
        }
        System.out.println(copy);
    }
}
