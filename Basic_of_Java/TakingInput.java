package Basic_of_Java;
import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int radius = sc.nextInt();        
        double pi = 3.1415;
        double area = pi * radius * radius;
        System.out.println("Area of the circle is: " + area);
    }    
}
