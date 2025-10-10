package Recursion_Java;

import java.util.Scanner;

public class printSSQ {
    static void printSubsequences(String str, String ans) {
        if( str.length()==0 ){
            System.out.println(ans);
            return;
        }

        char ch = str.charAt(0);

        String smallAns = str.substring(1);
        printSubsequences(smallAns, ans + ch);
        printSubsequences(smallAns, ans);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        printSubsequences(str, "");
    }
}
