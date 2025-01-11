package Loops_With_Java;
import java.util.Scanner;

public class GP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int a = 1, d = 2;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            a *= d;
        }
    }
}
