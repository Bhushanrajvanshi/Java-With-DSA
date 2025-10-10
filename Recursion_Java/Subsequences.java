package Recursion_Java;

import java.util.ArrayList;

public class Subsequences {

    static ArrayList<String> getSubSQ(String str){
        ArrayList<String> ans = new ArrayList<>();
        if(str.length()==0){
            ans.add("");
            return ans;
        }

        ArrayList<String> smallAns = getSubSQ(str.substring(1));
        char currAt = str.charAt(0);

        for(String s : smallAns){
            ans.add(s);
            ans.add(currAt + s);
        }
        return ans;
    }
    public static void main(String[] args) {
        ArrayList<String> ans = getSubSQ("abc");
        for(String s : ans) System.out.println(s);
    }
}
