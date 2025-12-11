package BackTracking;

public class FourDirection {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        boolean[][] isVisited = new boolean[rows][cols];   // by default false
        printPath(0, 0, rows-1, cols-1, "", isVisited);
    }

    private static void printPath(int sr, int sc, int er, int ec, String path, boolean[][] isVisited) {
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(isVisited[sr][sc]==true) return;
        if(sr==er && sc==ec){
            System.out.println(path);
            return;
        }

        isVisited[sr][sc]=true;

        printPath(sr+1, sc, er, ec, path+"D", isVisited);
        printPath(sr, sc+1, er, ec, path+"R", isVisited);
        printPath(sr-1, sc, er, ec, path+"U", isVisited);
        printPath(sr, sc-1, er, ec, path+"L", isVisited);
 
        isVisited[sr][sc]=false;
    }
}
