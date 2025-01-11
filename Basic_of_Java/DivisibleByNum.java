package Basic_of_Java;
import java.util.Scanner;
public class DivisibleByNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();
        if (num % divisor == 0) {
            System.out.println(num + " is divisible by " + divisor);
        } else {
            System.out.println(num + " is not divisible by " + divisor);
        }
    }
}
