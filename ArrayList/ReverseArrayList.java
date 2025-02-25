package ArrayList;
import java.util.ArrayList;
import java.util.Collections;


public class ReverseArrayList {

    static void reverseList(ArrayList<Integer> list) {
        int i=0, j=list.size()-1;
        while(  i<j ) {
            int temp = list.get(i);
            list.set(i, list.get(j));
            list.set(j, temp);
            i++; j--;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(10);
        list.add(3);
        list.add(5);
        list.add(22);
        list.add(10);

        System.out.println("Origin ArrayList "+ list+ " ");

        // reverseList(list);

        Collections.reverse(list);   //! It's a inbuilt function
        System.out.println("Reverse ArrayList "+ list+ " ");
        Collections.sort(list);
        System.out.println("Sorted ArrayList Ascending Orders:"+ list);
        Collections.sort(list, Collections.reverseOrder());
        System.out.println("Sorted ArrayList Descending Orders:"+ list);


        ArrayList<String> name = new ArrayList<>();
        name.add("Bhushan"); 
        name.add("Kumar");
        name.add("Rajvanshi");
        name.add("Aurangabad");

        
        System.out.println("Original ArrayList "+name);
        Collections.sort(name);
        System.out.println("Sorted ArrayList "+name);
        Collections.sort(name, Collections.reverseOrder());
        System.out.println("Reverse ArrayList "+name);

    }
    
}
