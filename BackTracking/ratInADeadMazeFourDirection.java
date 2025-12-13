package BackTracking;

public class ratInADeadMazeFourDirection {
    public static void main(String[] args) {
        int rows = 3;
        int cols = 3;
        int[][] maze = {{1, 0, 1},
                        {1, 1, 1}, 
                        {0, 1, 1}};
        printPath(0, 0, rows-1, cols-1, "", maze);
    }

    private static void printPath(int sr, int sc, int er, int ec, String path, int[][] maze){
        if(sr<0 || sc<0) return;
        if(sr>er || sc>ec) return;
        if(sr==er && sc==ec){
            System.out.println(path);
            return;
        }

        if(maze[sr][sc]==0) return;  // blocked
        if(maze[sr][sc]==-1) return;  // already visited

        // checking
        maze[sr][sc] = -1;

        printPath(sr+1, sc, er, ec, path+"D", maze);
        printPath(sr, sc+1, er, ec, path+"R", maze);
        printPath(sr-1, sc, er, ec, path+"U", maze);
        printPath(sr, sc-1, er, ec, path+"L", maze);

        // backtracking
        maze[sr][sc] = 1;
    }
}
