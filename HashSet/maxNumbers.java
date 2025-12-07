package HashSet;
import java.util.*;

public class maxNumbers {
    public static int maxNumberOnTable(int[] bug){
        HashSet<Integer> table = new HashSet<>();
        int Ans = 0;
        for(int i=0; i<bug.length; i++){
            int num = bug[i];
            if(table.contains(num)){
                table.remove(num);
            } else {
                table.add(num);
                Ans = Math.max(Ans, table.size());
            }
        }
        return Ans;
    }
    public static void main(String[] args) {
        int[] nums = {2, 1, 1, 3, 2, 3};
        System.out.println(maxNumberOnTable(nums));
    }
}
