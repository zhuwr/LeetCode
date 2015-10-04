public class Solution {
    public int maximalSquare(char[][] matrix) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length; 
        int n = matrix[0].length;
        int[][] sum = new int[m][n];
        int result = 0;
        for(int i=0; i<m; i++) {
            sum[i][0] = matrix[i][0]-'0';
            result = Math.max(result, sum[i][0]);
        }
        for(int i=0; i<n; i++) {
            sum[0][i] = matrix[0][i]-'0';
            result = Math.max(result, sum[0][i]);
        }
        for(int i=1; i<m; i++) {
            for(int j=1; j<n; j++) {
                if(matrix[i][j] == '1') {
                    sum[i][j] = Math.min(sum[i-1][j], Math.min(sum[i][j-1], sum[i-1][j-1])) + 1;
                } else {
                    sum[i][j] = 0;
                }
                result = Math.max(result, sum[i][j]);
            }
        }
        return result*result;
    }
}
