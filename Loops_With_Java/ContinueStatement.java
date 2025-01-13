package Loops_With_Java;

public class ContinueStatement {
    public static void main(String[] args) {
        // for (int i = 1; i <= 90; i++) {
        //     if( i==14 || i==27 ) continue;
        //     if( i%2==0 || i%3==0 ){
        //         System.out.print(i+" ");
        //     }
        // }


        for(int i=1; i<=100; i++){
            System.out.println("Hello!");
            if(i%2==1) continue;
            System.out.println("World!");
            // System.out.println(i);
        }
    }
}
