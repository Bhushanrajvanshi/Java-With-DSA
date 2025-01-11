package Loops_With_Java;
import java.util.Scanner;

public class TableInLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number what you want to print table");
        int num = sc.nextInt();
        for(int i=1; i<=10; i++){
            System.out.println(i+"*"+num+" = "+i*num);
        }
    }
}
