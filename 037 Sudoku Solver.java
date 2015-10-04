public class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board) {
        for(int i=0; i<9; i++) {
            for(int j=0; j<9; j++) {
                if(board[i][j] != '.') {
                    continue;
                }
                for(int k=1; k<=9; k++) {
                    board[i][j] = (char)(k+'0');
                    if(isValid(board, i, j) && solve(board)) {
                        return true;
                    }
                    board[i][j] = '.';
                }
                return false;
            }
        }
        return true;
    }
    public boolean isValid(char[][] board, int a, int b) {
        Set<Character> mySet = new HashSet<Character>();
        for(int i=0; i<9; i++) {
            if(mySet.contains(board[i][b])) {
                return false;
            } else {
                if (board[i][b] > '0' && board[i][b] <= '9') {
                        mySet.add(board[i][b]);
                }
            }
        }
        mySet = new HashSet<Character>();
        for(int i=0; i<9; i++) {
            if(mySet.contains(board[a][i])) {
                return false;
            } else {
                if (board[a][i] > '0' && board[a][i] <= '9') {
                        mySet.add(board[a][i]);
                }
            }
        }
        mySet = new HashSet<Character>();
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++){
                int x = a / 3 * 3 + i, y = b / 3 * 3 + j;
                if (mySet.contains(board[x][y])) {
                    return false;
                }
                if (board[x][y] > '0' && board[x][y] <= '9') {
                        mySet.add(board[x][y]);
                }
            } 
        }
        return true;
    }
}
