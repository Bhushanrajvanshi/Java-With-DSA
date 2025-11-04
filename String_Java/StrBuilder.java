package String_Java;
import java.util.*;

public class StrBuilder {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello");
        str.setCharAt(2, 'W');
        System.out.println(str);

        str.append(" World");
        System.out.println(str);
        str.insert(2, 'Y');
        System.out.println(str);
        str.delete(2, 4);
        System.out.println(str);
        // str.reverse();
        System.out.println(str);
        str.delete(2, 4);
        System.out.println(str);
    }
}
