package HashMap;
import java.util.*;

class Basics {
    static void BasicsHashMap(){
        Map<String, Integer> map = new HashMap<>();
        map.put("Akash", 21);
        map.put("Yash", 16);
        map.put("Lav", 17);
        map.put("Rishika", 19);
        map.put("Harry", 18);

        // Getting value of a key from the HashMap
        System.out.println(map.get("Akash"));         // 21
        System.out.println(map.get("Bhushan"));      //null

        // Changing or Updating value of a key in the HashMap
        map.put("Akash", 25);
        System.out.println(map.get("Akash"));         // 25

        // Removing a key from the HashMap
        map.remove("Akash");
        System.out.println(map.get("Akash"));         // null

        // Checking if a key is present in the HashMap
        System.out.println(map.containsKey("Akash"));       // false
        System.out.println(map.containsKey("Yash"));        // true

        // Checking if a value is present in the HashMap
        System.out.println(map.containsValue(21));          // true
        System.out.println(map.containsValue(18));          // false

        // Adding a new entries only if the key is not present in the HashMap
        map.putIfAbsent("Akash", 21);         // added 
        map.putIfAbsent("Yash", 16);         // not added

        // Get all keys from the HashMap
        System.out.println(map.keySet());           // Order does not follow it -> [Akash, Yash, Lav, Rishika, Harry]

        // Get all values from the HashMap
        System.out.println(map.values());         // Order does not follow it -> [21, 16, 17, 19, 18]
    }
    public static void main(String[] args) {
        BasicsHashMap();
    }
}