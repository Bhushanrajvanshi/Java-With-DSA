import java.util.*;
public class DivisibleTwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();

        int divisor1 = 3;
        int divisor2 = 5;

        if (num % divisor1 == 0 && num % divisor2 == 0) {
            System.out.println(num + " is divisible by both " + divisor1 + " and " + divisor2);
        } else if (num % divisor1 == 0) {
            System.out.println(num + " is divisible by " + divisor1);
        } else if (num % divisor2 == 0) {
            System.out.println(num + " is divisible by " + divisor2);
        } else {
            System.out.println(num + " is not divisible by both " + divisor1 + " and " + divisor2);
        }
    }
}
