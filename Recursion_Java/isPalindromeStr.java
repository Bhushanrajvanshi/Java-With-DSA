package Recursion_Java;

import java.util.Scanner;

public class isPalindromeStr {
    static String reverseString(String str){
        if( str.length()==0 ) return "";
        
        String smallAns = reverseString(str.substring(1));
        char currAt = str.charAt(0);
        
        return smallAns + currAt;
    }


    static boolean isPalindrome(String str, int start, int end){
        if( start>=end ) return true;
        return (str.charAt(start) == str.charAt(end) && isPalindrome(str, start+1, end-1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        String reverseStr =  reverseString(str);

        System.out.println(str);
        System.out.println(reverseStr);
        System.out.println(reverseStr.equals(str));

        if(str.equals(reverseStr)){
            System.out.println(str + ": is a palindrome string");
        } else {
           System.out.println(str + ": is a not palindrome string");
        }

        System.out.println(isPalindrome(str, 0, str.length()-1));

        sc.close();
    }
}
