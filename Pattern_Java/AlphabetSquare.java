package Pattern_Java;
import java.util.Scanner;

public class AlphabetSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)(j+64) + " ");
            }
            System.out.println();
        }
    }
}
