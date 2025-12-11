package BackTracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        char[][] board = new char[n][n];
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                board[i][j] = 'X';
            }
        }
        nQueen(board, 0);
    }

    public static void printBoard(char[][] board) {
        int n = board.length;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }


    private static void nQueen(char[][] board, int row) {
        int n = board.length;

        if(row == n) {
            printBoard(board);
            System.out.println();
            return;
        }

        for(int j=0; j<n; j++){
            if(isSafe(board, row, j)){
                board[row][j] = 'Q';
                nQueen(board, row+1);    // recursion
                board[row][j] = 'X';     // backtracking
            }
        }
    }

    private static boolean isSafe(char[][] board, int row, int col) {
        int n = board.length;

        // check row 
        for(int j=0; j<n; j++){
            if(board[row][j] == 'Q') return false;
        }

        // check col
        for(int i=0; i<n; i++){
            if(board[i][col] == 'Q') return false;
        }

        // north & east diagonal
        int i = row, j = col;
        while(j>=0 && i>=0) {
            if(board[i][j] == 'Q') return false;
            i--; j--;
        }

        // south & west diagonal
        i = row; j = col;
        while(j<n && i>=0) {
            if(board[i][j] == 'Q') return false;
            i--; j++;
        }

        // south & east diagonal
        i = row; j = col;
        while(i<n && j<n) {
            if(board[i][j] == 'Q') return false;
            i++; j++;
        }

        // north & west diagonal
        i = row; j = col;
        while(i<n && j>=0) {
            if(board[i][j] == 'Q') return false;
            i++; j--;
        }


        return true;
    }
}
