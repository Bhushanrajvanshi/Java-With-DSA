package Recursion_Java;

import java.util.Scanner;

public class greaterCommonDivisin {
    static int gcd(int a, int b) {
        // while ( a%b != 0) {
        //     int rem = a%b;
        //     a = b;
        //     b = rem;
        // }
        // return b;


        //! Euclids Algorithm 
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        System.out.println("The GCD of " + a + " and " + b + " is: " + gcd(a, b));
    }
    
}
