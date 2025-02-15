package Recursion_Java;
import java.util.Scanner;

public class Intro_Rec {
    static void printNum(int num){
        if(num==1){
            System.out.print(num);
            return;
        }
        printNum(+num-1); 
        System.out.print(" "+num);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        printNum(num);
    }
}
