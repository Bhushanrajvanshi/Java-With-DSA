import java.util.*;
public class ProfitOrLoss {
    public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     System.out.print("Enter the cost price: ");
     int costPrice = sc.nextInt();
     System.out.print("Enter the selling price: ");
     int sellingPrice = sc.nextInt();

     int profit = sellingPrice - costPrice;
     int loss = costPrice - sellingPrice;

     if(sellingPrice>costPrice){
         System.out.println("Profit: "+profit);
    } else {
        System.out.println("Loss: "+loss);
    }
    }
}
