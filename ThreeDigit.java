import java.util.Scanner;
public class ThreeDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        if (num > 99 && num <= 999) {
            System.out.println(num + " is a three-digit number.");
        } else {    
            System.out.println(num + " is not a three-digit number.");
        }        
    }
}
