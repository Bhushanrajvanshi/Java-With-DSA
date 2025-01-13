package Loops_With_Java;
import java.util.*;

public class SumofNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int sum = 0;
        // for (int i = 1; i <= num; i++) {
        //     sum += i;
        // }

        int i=0;
        while (i <= num) {
            sum += i;
            i++;
        }
        System.out.println("The sum of is: " + sum);
    }
}
