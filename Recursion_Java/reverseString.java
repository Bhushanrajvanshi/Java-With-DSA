package Recursion_Java;

import java.util.Scanner;

public class reverseString {
    static String ReverseString(String str, int idx){
        if(idx==str.length()) return " ";

        String smallAns = ReverseString(str, idx+1);
        char currAt = str.charAt(idx);

        return smallAns + currAt;
    }


    static String ReverseStringTwo(String str){
        if( str.length()==0 ) return " ";

        String smallAns = ReverseStringTwo(str.substring(1));
        char currAt = str.charAt(0);

        return smallAns + currAt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(ReverseString(str, 0));
        System.out.println(ReverseStringTwo(str));

        sc.close();
    }
}
