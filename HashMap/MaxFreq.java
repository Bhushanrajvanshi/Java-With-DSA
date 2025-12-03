package HashMap;
import java.util.*;

public class MaxFreq {
    public static void main(String[] args) {
     int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
     
     Map<Integer, Integer> map = new HashMap<>();
     for( int el:arr ){
        if(!map.containsKey(el)){
            map.put(el, 1);
        } else {
            map.put(el, map.get(el) + 1);
        }
     }

     System.out.println(map.values());
     System.out.println("Frequency map. !");
     System.out.println(map.entrySet());


     int maxFreq = 0, ansKet = -1;
    //  for( var e:map.entrySet() ){
    //     if(e.getValue() > maxFreq){
    //         maxFreq = e.getValue();
    //         ansKet = e.getKey();
    //     }
    //  }


     for( var key:map.keySet()){
        if(map.get(key)>maxFreq){
            maxFreq = map.get(key);
            ansKet = key;
        }
     }

     System.out.printf("%d has max frequency and it occurs %d times\n", ansKet, maxFreq);

     
    }
}
