package Pattern_Java;
import java.util.Scanner;

public class PlusStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        int middle = num/2+1;

        for (int i=1; i<=num; i++) {
            for (int j=1; j<=num; j++) {
                if (i==middle || j==middle) {
                    System.out.print("* ");
                } else {
                    System.out.print("# ");
                }
            }
            System.out.println();
        }
    }
}
