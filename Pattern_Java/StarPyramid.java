package Pattern_Java;
import java.util.Scanner;

public class StarPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        // for (int i=1; i<=num; i++) {
        //     for (int j=1; j<=num-i; j++) {
        //         System.out.print(" "+" ");
        //     } 
        //     for (int j=1; j<=2*i-1; j++) {
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }


        int nsp=num-1, nst=1;
        for(int i=1; i<=num; i++){
            for(int j=1; j<=nsp; j++){
                System.out.print(" "+" ");
            }
            for(int j=1; j<=nst; j++){
                System.out.print("*"+" ");
            }
            nsp--;
            nst+=2;
            System.out.println();
        }
    }
}
