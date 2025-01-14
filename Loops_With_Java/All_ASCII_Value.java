package Loops_With_Java;
import java.util.Scanner;

public class All_ASCII_Value {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Capital number ASCII value is 65 to 90
        // Small number ASCII value is 97 to 22
        System.out.print("Enter the ASCII Value Number. ");
        int num = sc.nextInt();
        for (int i = num; i<=num+25; i++) {
            System.out.println(i+" "+(char)i);
        }
    }
}
