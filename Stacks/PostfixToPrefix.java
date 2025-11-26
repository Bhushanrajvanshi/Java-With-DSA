package Stacks;

import java.util.Stack;

public class PostfixToPrefix {
    public static void main(String[] args) {
        String postFix = "953+4*6/-";
        Stack<String> st = new Stack<>();

        for(int i=0; i<postFix.length(); i++){
            char ch = postFix.charAt(i);
            int ascii = (int)ch;

            // ASCII Value 0 -> 48 to 9 -> 57
            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                st.push(s);
                // st.push(ascii-48);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                String s = ch + v2+ v1;
                st.push(s);
            }   
        }
        System.out.println(st.pop());
    }
}
