package Loops_With_Java;
import java.util.Scanner;
public class SecondAP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // for (int i=4; i<=3*num+1; i+=3) {
        //     System.out.print(i + " ");
        // }


        int a = 4, d = 3;
        for (int i = 1; i <= num; i++) {
            System.out.print(a + " ");
            a += d;
        }
    }
}
