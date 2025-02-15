package Recursion_Java;
import java.util.Scanner;

public class ReverseNum {
    static void ReverseNum(int n) {
        if( n==1 ){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        ReverseNum(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = sc.nextInt();

        ReverseNum(n);

    }
}
