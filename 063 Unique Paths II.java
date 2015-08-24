public class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] result = new int[m][n];
        boolean flagx = false;
        boolean flagy = false;
        for(int i=0; i<m; i++) {
            if(flagx){
                result[i][0] = 0;
            }else if(obstacleGrid[i][0]==1){
                result[i][0] = 0;
                flagx = true;
            }else{
                result[i][0] = 1;
            }
        }
        for(int i=0; i<n; i++) {
            if(flagy){
                result[0][i] = 0;
            }else if(obstacleGrid[0][i]==1){
                result[0][i] = 0;
                flagy = true;
            }else{
                result[0][i] = 1;
            }
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                result[i][j]= result[i-1][j] + result[i][j-1];
                if(obstacleGrid[i][j] == 1) {
                    result[i][j] = 0;
                }
            }
        }
        return result[m-1][n-1];
    }
}
