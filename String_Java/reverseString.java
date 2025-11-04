public class reverseString {
    public static void main(String[] args) {
        String str = "i am a student of BCA";
        System.out.println(str);
        String ansStr = "";
        StringBuilder sb = new StringBuilder("");
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) !=' '){
                sb.append(str.charAt(i));
            } else {
                sb.reverse();
                ansStr += sb;
                ansStr += ' ';
                sb = new StringBuilder("");
            }
        }
        sb.reverse();
        ansStr += sb;

        
        // for (int i = str.length() - 1; i >= 0; i--) {
        //     ansStr += str.charAt(i);
        // }
        System.out.println(ansStr);
    }
}
