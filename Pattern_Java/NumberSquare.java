package Pattern_Java;
import java.util.Scanner;

public class NumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {      // rows
            for (int j = 1; j <= num; j++) {  // columns
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
