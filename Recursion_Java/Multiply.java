package Recursion_Java;
import java.util.Scanner;

public class Multiply {
    static void printMultiple(int num1, int num2) {
        if (num2 == 0) {
            // System.out.print(num1);
            return ;
        }
        printMultiple(num1, num2 - 1);
        System.out.print(" "+num1 * num2);
    }

    static int sumOfSeries(int n){
        if( n==0 ) return 0;
        return n + sumOfSeries(n-1);
    }

    static int seriesSum(int n){
        if(  n==0 ) return 0;

        if(n%2==0) return seriesSum(n-1) - n;
        else return seriesSum(n-1) + n;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the number: ");
        int num2 = sc.nextInt();
        printMultiple(num1, num2);
        System.out.println();
        System.out.println(sumOfSeries(num1));
        System.out.println(seriesSum(num1));
    }
}
