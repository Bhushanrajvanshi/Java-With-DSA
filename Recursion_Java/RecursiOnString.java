package Recursion_Java;

import java.util.Scanner;

public class RecursiOnString {

    static String printString(String str){
        if(str.length()==0) return " ";
        String smallAnswer = printString(str.substring(1));
        return str.charAt(0) + smallAnswer;
    }

    
    static String RemoveCharOccurrence(String str, int idx){
        if(idx==str.length()) return " ";

        String smallAnswers = RemoveCharOccurrence(str, idx+1);
        char currAt = str.charAt(idx);

        if(currAt != 'a'){
            return currAt + smallAnswers;
        } else {
            return smallAnswers;
        }
    }

    static String RemoveCharOccurrenceTwo(String str){
        if( str.length()==0 ) return " ";

        String smallAns = RemoveCharOccurrenceTwo(str.substring(1));
        char currAt = str.charAt(0);
        if(currAt != 'a'){
            return currAt + smallAns;
        } else {
            return smallAns;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(printString(str));
        System.out.println(RemoveCharOccurrence(str, 0));
        System.out.println(RemoveCharOccurrenceTwo(str));
    }
}
