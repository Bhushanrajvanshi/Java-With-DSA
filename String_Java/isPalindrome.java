import java.util.*;

public class isPalindrome {
    static boolean Palindrome(String str){
        int start = 0, end = str.length()-1;
        while(start<end){
            if(str.charAt(start)!=str.charAt(end)) return false;
            start++; end--;
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = sc.nextLine();
        System.out.println(Palindrome(str));
    }
}
