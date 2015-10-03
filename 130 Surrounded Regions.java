public class Solution {
    Queue<Integer> queue = new LinkedList<Integer>();
    public void solve(char[][] board) {
        if(board == null || board.length == 0|| board[0].length == 0) {
            return;
        }
        int m = board.length;
        int n = board[0].length;
        
        for(int i=0; i<m; i++) {
            bfs(board, i, 0);
            bfs(board, i, n-1);
        }
        for(int i=0; i<n; i++) {
            bfs(board, 0, i);
            bfs(board, m-1, i);
        }
        while(!queue.isEmpty()) {
            int num = queue.poll();
            int i = num/n;
            int j = num%n;
            board[i][j] = 'i';
            bfs(board, i-1, j);
            bfs(board, i+1, j);
            bfs(board, i, j-1);
            bfs(board, i, j+1);
        }
        for(int i=0; i<m; i++) {
            for(int j=0; j<n; j++) {
                if(board[i][j] == 'O') {
                    board[i][j] = 'X';
                } else if(board[i][j] == 'i') {
                    board[i][j] = 'O';
                }   
            }
        }
    }
    public void bfs(char[][] board, int i, int j) {
        int m = board.length;
        int n = board[0].length;
        if(i>=0&&i<m&&j>=0&&j<n&&board[i][j] == 'O') {
            queue.offer(i*n+j);
        }
    }
}
