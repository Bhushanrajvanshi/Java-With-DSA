public class palindromicSubstring {
    static boolean isPalindrome(String str){
        int start = 0, end = str.length()-1;
        while( start<end ){
            if(str.charAt(start) != str.charAt(end)) return false;
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "abcba";
        int count = 0;
        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<=str.length(); j++){
                if( isPalindrome(str.substring(i, j))==true ){
                    System.out.print(str.substring(i, j)+" ");
                    count++;
                }
            }
        }
        System.out.println("\ntotal palindromic substring: "+count);
    }
}
