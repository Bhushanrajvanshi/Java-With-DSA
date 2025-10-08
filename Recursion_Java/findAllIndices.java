package Recursion_Java;

import java.util.ArrayList;

public class findAllIndices {
    static ArrayList<Integer> AllIndices(int[] arr, int terget, int idx){
        int n = arr.length;
        ArrayList<Integer> ans = new ArrayList<>();
        if( idx==n ) return ans;
        
        if(arr[idx] == terget ){
            ans.add(idx);
        }

        ArrayList<Integer> smallAnswer = AllIndices(arr, terget, idx+1);
        ans.addAll(smallAnswer);
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 5, 4, 4};
        int terget = 4;
        ArrayList<Integer> ans = AllIndices(arr, terget, 0);
        for(Integer i : ans ){
            System.out.print(i + " ");
        }
    }
    
}
