package NumberSystem;
import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the decimal number: ");
        int decimal = sc.nextInt();
        int binary = 0;
        int power = 0;
        while (decimal > 0) {
            int rem = decimal % 2;
            binary += rem * Math.pow(10, power);
            decimal /= 2;
            power++;
        }
        System.out.println("Binary number is: " + binary);
    }
}
