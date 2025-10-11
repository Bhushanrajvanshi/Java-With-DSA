package Recursion_Java;

import java.util.Scanner;

public class KeypadCombinations {
    static void printKeyCombinations(String digits, String[] kp, String ans) {
        if( digits.length() == 0 ){
            System.out.print(ans+" ");
            return;
        }

        int currDigit = digits.charAt(0) - '0'; // converting char to int
        String currChoices = kp[currDigit];
        for(int i=0; i<currChoices.length(); i++){
            printKeyCombinations(digits.substring(1), kp, ans+currChoices.charAt(i));
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        String digits = sc.next();
        String[] kp = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"}; // keypad combinations
        printKeyCombinations(digits, kp, "");
    }
}
