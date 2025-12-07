package HashSet;

import java.util.*;

public class Basics {
    public static void main(String[] args) {
        HashSet<String> st = new HashSet<>();
        st.add("Bhushan");
        st.add("Kumar");
        st.add("Rajvanshi");
        st.add("Chichmi");
        st.add("Aurangabad");
        System.out.println(st);
        System.out.println(st.contains("Bhushan"));  // true or false
        System.out.println("Size of set is: "+ st.size());
        System.out.println(st.remove("Bhushan"));
        System.out.println(st.contains("Bhushan"));  // true or false
        System.out.println("Size of set is: "+ st.size());
        for(String s : st ){
            System.out.print(s + "\n");
        }

    }
}
