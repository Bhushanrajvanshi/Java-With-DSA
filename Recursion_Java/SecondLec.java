package Recursion_Java;

public class SecondLec {
    static int someOfDigit(int n) {
        if( n >= 0 && n <= 9 ) return n;
        // int smallOutput = someOfDigit(n/10);
        // int ans = smallOutput + n%10;
        // return ans;
        return someOfDigit(n/10) + n%10;
    }

    static int countOfDigit(int n) {
        if( n >= 0 && n <= 9 ) return 1;
        return countOfDigit(n/10) + 1;
    }

    static int power(int p, int q) {
        if( q==0 ) return 1;
        return p*power(p, q-1);
    }

    static int pow(int p, int q){
        if( q==0 ) return 1;

        int smollPow = pow(p, q/2);

        if( q%2 == 0 ) return smollPow*smollPow;

        else return smollPow*smollPow*p;
    }
    public static void main(String[] args) {
        // System.out.println(someOfDigit(12034));
        // System.out.println(countOfDigit(0));
        // System.out.println(power(2, 3));
        System.out.println(pow(2, 4));
        
    }
}
