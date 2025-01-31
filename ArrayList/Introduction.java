package ArrayList;
import java.util.*;

public class Introduction {
    public static void main(String[] args) {
        // Wrapper Classes
        Integer a = Integer.valueOf(10);
        System.out.println(a);
        Float b = Float.valueOf(10.5f);
        System.out.println(b);

        ArrayList<Integer> list = new ArrayList<>();
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        System.out.println(list.get(1));
        for(int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + " ");
        } 
        System.out.println();
        // Adding element at specific index
        list.add(1, 100);
        // Modifying element at specific index
        System.out.println(list);
        list.set(1, 55);
        System.out.println(list);
        // Removing element at specific index
        list.remove(1);
        System.out.println(list);
        // Removing element
        list.remove(Integer.valueOf(80)); //! It's return boolean value true or false,
        System.out.println(list);
        // Checking element is present or not
        System.out.println(list.contains(60));  //! It's return boolean value true or false,
        // Size of array list
        System.out.println(list.size());
        // Clearing array list
        list.clear();
        System.out.println(list);
    }
}


//!   Notes
//? Wrapper classes 
// 1. ->   a class whose objects can hold or wraps primitive data types,
// 2. ->   Objects of a wrapper classes cantains a field which stores PDT -> primitive data types,
