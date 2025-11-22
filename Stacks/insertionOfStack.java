package Stacks;
import java.util.Stack;

public class insertionOfStack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);


        int idx = 2;
        int val = 15;

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx){
            temp.push(st.pop());
        }
        st.push(val);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }
        System.out.println(st);

        // st.add(2, 25);
    }
}
