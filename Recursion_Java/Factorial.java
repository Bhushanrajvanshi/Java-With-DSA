package Recursion_Java;
import java.util.Scanner;

public class Factorial {
    static int factorial(int num) {
        if(num==0) return 1;
        // int fact = num * factorial(num-1);
        return num * factorial(num-1);
    }

    static int nThFibonacci(int num) {
        if(num==0 || num==1) return num;
        return nThFibonacci(num-1) + nThFibonacci(num-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // System.out.println("The factorial of " + num + " is: " + factorial(num));
        System.out.println("The fibonacci of " + num + " is: " + nThFibonacci(num));

        for(int i=0; i<=num; i++) {
            System.out.print(nThFibonacci(i)+" ");
        }
    }
}
