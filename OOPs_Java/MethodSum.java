package OOPs_Java;
import java.util.Scanner;

public class MethodSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Two number of integers: ");
        int x = sc.nextInt();
        int y = sc.nextInt();

        Sum obj = new Sum();       // creating object of Sum class
        int Ans = obj.add(x, y);
        System.out.println("Sum is: " + Ans);

    }
}

class Sum{      // it is a class
    int add(int a, int b){      // it is a method
        int ans = a+b;
        return ans;
    }
}


//! Q: What is package in java?
//? Ans: It is a collection of similar-classes, subpackages and interfaces.