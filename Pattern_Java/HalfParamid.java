package Pattern_Java;
import java.util.*;

public class HalfParamid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();
        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                if(i%2!=0){
                    System.out.print(j+" ");
                } else {
                    System.out.print((char)(j+64) +" ");
                }
            }
            System.out.println();
        }
    }
}
