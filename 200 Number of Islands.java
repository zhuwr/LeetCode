public class Solution {
    public int numIslands(char[][] grid) {
        int result = 0;
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid[0].length; j++) {
                if(grid[i][j] == '1') {
                    change(grid, i, j);
                    result++;
                }
            }
        }
        return result;
    }
    public void change(char[][] grid, int m, int n) {
        grid[m][n] = '0';
        if(m>0 && grid[m-1][n] == '1') {
            change(grid, m-1, n);
        }
        if(m<grid.length-1 && grid[m+1][n] == '1') {
            change(grid, m+1, n);
        }
        if(n>0 && grid[m][n-1] == '1') {
            change(grid, m, n-1);
        }
        if(n<grid[0].length-1 && grid[m][n+1] == '1') {
            change(grid, m, n+1);
        }
    }
}
