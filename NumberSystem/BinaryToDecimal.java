package NumberSystem;
import java.util.Scanner;

public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the binary number: ");
        int binary = sc.nextInt();
        int decimal = 0;
        int power = 0;
        while (binary > 0) {
            int rem = binary % 10;
            decimal += rem * Math.pow(2, power);
            binary /= 10;
            power++;
        }
        System.out.println("Decimal number is: " + decimal);
    }
}
