package Basic_of_Java;
import java.util.Scanner;

public class SwapTwoNum {
    static void swap(int a, int b) {
        System.out.println("Befor swaping Value of a: "+a+" and Value of b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping Value of a: "+a+" and Value of b: "+b);
    }

    static void SwapWithoutTemp(int a, int b) {
        System.out.println("Befor swaping Value of a: "+a+" and Value of b: "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swaping Value of a: "+a+" and Value of b: "+b);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int a = sc.nextInt();
        System.out.print("Enter the second number: ");
        int b = sc.nextInt();
        swap(a, b);
        // SwapWithoutTemp(a, b);
    }
}
