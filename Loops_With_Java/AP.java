package Loops_With_Java;
import java.util.Scanner;

public class AP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i=1; i<=2*num-1; i+=2) {
            System.out.print(i + " ");
        }
    }
}
