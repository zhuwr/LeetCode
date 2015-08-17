public class Solution {
    public int uniquePaths(int m, int n) {
        int[][] nums = new int[m][n];
        for(int i=0; i<m; i++) {
            nums[i][0] = 1;
        }
        for(int j=0; j<n; j++) {
            nums[0][j] = 1;
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                nums[i][j] = nums[i-1][j] + nums[i][j-1];
            }
        }
        return nums[m-1][n-1];
    }
}
