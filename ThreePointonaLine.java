public class ThreePointonaLine {
    public static void main(String[] args) {
        int x1=2,y1=3,x2=4,y2=2,x3=3,y3=4;
        int n = (x2-x1)/(y2-y1);
        int m = (x3-x2)/(y3-y2);
        if(n==m){
            System.out.println("yes, line through three points on a single line");
        }
        else{
            System.out.println("no, line through three points on a single line");
        }
    }
}
