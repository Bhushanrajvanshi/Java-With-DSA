import java.util.*;
public class GreaterNumThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number.");
        int one = sc.nextInt();
        System.out.print("Enter the second number.");
        int two = sc.nextInt();
        System.out.print("Enter the third number.");
        int three = sc.nextInt();
        if( one>two ){
            if ( one>three ) {
                System.out.println("Greater number is "+one);
            } else {
                System.out.println("Greater number is "+three);
            }
        } else {
            System.out.println("Greater number is "+two);
        }
    }
}
