package Stacks;

import java.util.Stack;

public class InfixToPostfix {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        Stack<String> st = new Stack<>();
        Stack<Character> op = new Stack<>();

        for(int i=0; i<infix.length(); i++){
            char ch = infix.charAt(i);
            int ascii = (int)ch;

            // ASCII Value 0 -> 48 to 9 -> 57
            if(ascii>=48 && ascii<=57){
                String s = "" + ch;
                st.push(s);
            } 
            else if(op.size()==0 || ch=='(' || op.peek()=='(') op.push(ch);
            else if(ch==')'){
                while(op.peek()!='('){
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String s = v1 + v2 + o;
                    st.push(s);
                }
                op.pop();
            }
            else {
                if(ch=='+' || ch=='-'){
                    // work 
                    String v2 = st.pop();
                    String v1 = st.pop();
                    char o = op.pop();
                    String s = v1 + v2 + o;
                    st.push(s);
                    // push the operator 
                    op.push(ch);
                }
                if(ch=='*' || ch=='/'){
                    if(op.peek()=='*' || op.peek()=='/'){
                        String v2 = st.pop();
                        String v1 = st.pop();
                        char o = op.pop();
                        String s = v1 + v2 + o;
                        st.push(s);
                        // push the operator 
                        op.push(ch);
                    } else {
                        op.push(ch);
                    }
                }
            }
             
        }
        while(st.size()>1){
            String v2 = st.pop();
            String v1 = st.pop();
            char o = op.pop();
            String s = v1 + v2 + o;
            st.push(s);
        }
        System.out.println(st.peek());
    }
}
