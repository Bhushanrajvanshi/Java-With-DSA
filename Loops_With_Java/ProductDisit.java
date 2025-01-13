package Loops_With_Java;
import java.util.*;

public class ProductDisit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int product = 1;
        while (num != 0) {
            int rem = num % 10;
            product *= rem;
            num = num / 10;
        }
        System.out.println("The product of is: " + product);
    }
}
