public class consecutiveString {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        int count = 1;
        StringBuilder ans = new StringBuilder(str.charAt(0));

        for(int i=1; i<str.length(); i++){
            if(str.charAt(i)==str.charAt(i-1)){
                count++;
            } else {
                ans.append(str.charAt(i-1));
                ans.append(count);
                count = 1;
            }
        }
        ans.append(str.charAt(str.length()-1));
        ans.append(count);
        System.out.println(ans);




        // String ansStr = str.charAt(0)+"";
        // for(int i=1; i<str.length(); i++){
        //     if(str.charAt(i)!=str.charAt(i-1)){
        //         ansStr += str.charAt(i);
        //     }
        // }
        // System.out.println(ansStr);
    }
}
