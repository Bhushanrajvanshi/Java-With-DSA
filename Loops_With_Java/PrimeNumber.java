package Loops_With_Java;
import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        boolean isPrime = false;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                isPrime = true;
                break;
            }
        }
        if(num==1){
            System.out.println("1 is neither prime nor composite.");
        }
        else if (!isPrime) {
            System.out.println(num + " is a prime number.");
        } else {
            System.out.println(num + " It is a Composite number.");
        }
    }
}
