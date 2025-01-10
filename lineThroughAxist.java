import java.util.Scanner;
public class lineThroughAxist {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the positives x axis: ");
        int x = sc.nextInt();
        System.out.print("Enter the positives y axis: ");
        int y = sc.nextInt();
        if(x==0 && y==0){
            System.out.println("The point is on the origin.");
        } else if(x==0 && y!=0){
            System.out.println("The point is on the y axis.");
        } else if(x!=0 && y==0) {
            System.out.println("The point is on the x axis.");
        } else {
            System.out.println("The point belongs to other line");
        }
    }
}
