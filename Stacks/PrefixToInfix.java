package Stacks;

import java.util.Stack;

public class PrefixToInfix {
    public static void main(String[] args) {
        String preFix = "-9/*+5346";  // output = (9-(((5+3)*4)/6))
        Stack<String> st = new Stack<>();

        for(int i=preFix.length()-1; i>=0; i--){
            char ch = preFix.charAt(i);
            int ascii = (int)ch;

            // ASCII Value 0 -> 48 to 9 -> 57
            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                st.push(s);
                // st.push(ascii-48);
            } else {
                String v1 = st.pop();
                String v2 = st.pop();
                String s = "(" + v1 + ch + v2 + ")";
                st.push(s);
            }   
        }
        System.out.println(st.pop());
    }
}
