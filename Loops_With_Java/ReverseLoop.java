package Loops_With_Java;
import java.util.Scanner;

public class ReverseLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        for(int i=num; i>=1; i--){ 
            System.out.print(i+" "); 
        }
    }
}
