package Loops_With_Java;
import java.util.Scanner;

public class ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the character:");
        char ch = sc.next().charAt(0);
        int ascii = ch;
        System.out.println("The ASCII value of " + ch + " is: " + ascii);
    }
}
