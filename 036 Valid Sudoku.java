public class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean[] visited = new boolean[9];
        for(int i=0; i<9; i++) {
            Arrays.fill(visited, false);
            for(int j=0; j<9; j++) {
                if(!valid(visited, board[i][j])) {
                    return false;
                }
            }
        }
        
        for(int i=0; i<9; i++) {
            Arrays.fill(visited, false);
            for(int j=0; j<9; j++) {
                if(!valid(visited, board[j][i])) {
                    return false;
                }
            }
        }
        
        for(int i=0; i<9; i+=3) {
            
            for(int j=0; j<9; j+=3) {
                Arrays.fill(visited, false);
                for(int k=0; k<9; k++) {
                    if(!valid(visited, board[i+k/3][j+k%3])) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
    public boolean valid(boolean[] visited, char digit) {
        if(digit == '.') {
            return true;
        }
        if(digit-'0'<=0 || digit-'9'>0 || visited[digit-'1']) {
            return false;
        }
        visited[digit-'1'] = true;
        return true;
    }
}
