package Basic_of_Java;
import java.util.*;
public class nestedIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positive integer number: ");
        int num = sc.nextInt();

        // if (num%3==0 || num%5==0) {
        //     if (num%15!=0){
        //         System.out.println("The number is divisible by 3 or 5. but not divisible by 15.");
        //     } else {
        //         System.out.println("The number is not divisible by 3 and 5.");
        //     }
        // } else {
        //     System.out.println("The number is not divisible by 3 or 5.");
        // }

        if (num%15 != 0 && (num%5==0 || num%3==0)) {
            System.out.println("The number is divisible by 3 or 5. but not divisible by 15.");
        } else {
            System.out.println("The number is not divisible by 3 or 5.");
        }
    }
}
