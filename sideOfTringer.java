import java.util.Scanner;
public class sideOfTringer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first angle: ");
        int angle1 = sc.nextInt();
        System.out.print("Enter the second angle: ");
        int angle2 = sc.nextInt();
        System.out.print("Enter the third angle: ");
        int angle3 = sc.nextInt();
        if( angle1+angle2 > angle3 && angle1+angle3 > angle2 && angle2+angle3 > angle1) {
            System.out.println("The triangle is valid.");
        } else {
            System.out.println("The triangle is not valid.");
        }
    }
}
