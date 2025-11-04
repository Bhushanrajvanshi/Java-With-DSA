package String_Java;

import java.util.*;

public class ToggleString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Some Word.");
        StringBuilder str = new StringBuilder(sc.nextLine());
        System.out.println(str);

        for(int i=0; i<str.length(); i++){
            boolean flag = true;
            char ch = str.charAt(i);
            if(ch==' ') continue;
            if(ch>=0 || ch<=9) continue;
            int asci = (int)ch;
            if(asci>=97) flag = false;
            if(flag==true){
                asci += 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            } else {
                asci -= 32;
                char dh = (char)asci;
                str.setCharAt(i, dh);
            }
        }

        // for (int i = 0; i < str.length(); i++) {
        //     if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
        //         str.setCharAt(i, (char) (str.charAt(i) - 'a' + 'A'));
        //     } else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
        //         str.setCharAt(i, (char) (str.charAt(i) - 'A' + 'a'));
        //     }
        // }
        System.out.println(str);
    }
}
