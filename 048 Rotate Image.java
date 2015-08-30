public class Solution {
    public void rotate(int[][] matrix) {
        if(matrix == null || matrix.length == 0) {
            return ;
        }
        int n = matrix.length, count = 0;
        while(count < n/2) {
            for(int i=count; i<n-count-1; i++) {
                int temp = matrix[count][i];
                matrix[count][i] = matrix[n-i-1][count]; 
                matrix[n-i-1][count] = matrix[n-count-1][n-i-1];
                matrix[n-count-1][n-i-1] = matrix[i][n-count-1];
                matrix[i][n-count-1] = temp;
            }
            count++;
        }
    }
}
