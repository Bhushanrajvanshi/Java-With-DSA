package Stacks;
import java.util.*;

public class RemoveConsecutiveSubsequences {
    public static int[] removeSubsequence(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<n; i++){
            if(st.isEmpty() || st.peek() != arr[i]){
                st.push(arr[i]);
            } else if(arr[i]==st.peek()){
                if( i==n-1 || arr[i]!=arr[i+1]){
                    st.pop();
                }
            }
        }

        int[] ans = new int[st.size()];
        int m = ans.length-1;
        for(int i=m; i>=0; i--){
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 10, 10, 10, 4, 4, 4, 5, 7, 7, 2};
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("\n");

        int[] newAns = removeSubsequence(arr);
        for(int i=0; i<newAns.length; i++){
            System.out.print(newAns[i] + " ");
        }
        System.out.println();
    }
    
}
