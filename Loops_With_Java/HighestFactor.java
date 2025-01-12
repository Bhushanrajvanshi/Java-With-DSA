package Loops_With_Java;
import java.util.*;

public class HighestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        int HighestFactor = 0;
        for (int i=num-1; i >=1; i--) {
            if (num % i == 0){
                // System.out.print(i + " ");
                HighestFactor = i;
                break;
            }
        }
        System.out.println("The highest factor of " + num + " is " + HighestFactor);
    }
}
