package Loops_With_Java;
import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the number");      
     int num = sc.nextInt();
     for(int i=1; i<=num; i++){
        System.out.print(i+" ");
     }
    }
}
