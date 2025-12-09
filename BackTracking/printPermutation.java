package BackTracking;
import java.util.*;

public class printPermutation {
    public static void prinTPermutation(String str, String ans, List<String> list){
        if(str.equals("")){
            // System.out.println(ans);
            list.add(ans);
            return;
        }

        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            String left = str.substring(0, i);
            String right = str.substring(i+1);
            String remain = left + right;
            prinTPermutation(remain, ans+ch, list);
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(); 
        String str = "abc";
        String ans = "";
        prinTPermutation(str, ans, list);
        for(String s : list) System.out.println(s);
        // System.out.println(list);
    }
}
