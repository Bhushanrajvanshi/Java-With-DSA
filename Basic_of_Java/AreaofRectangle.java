package Basic_of_Java;
import java.util.*;
public class AreaofRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length: ");
        int length = sc.nextInt();
        System.out.print("Enter the breadth: ");
        int breadth = sc.nextInt();

        int area = length * breadth;
        int perimeter = 2 * (length + breadth);
        
        if(area>perimeter){
            System.out.println("Area of the rectangle is greater than perimeter");
        } else if(perimeter>area){
            System.out.println("Perimeter of the rectangle is grater than area");
        } else{
            System.out.println("Area of the rectangle is equal to perimeter");
        }   
    }
}
