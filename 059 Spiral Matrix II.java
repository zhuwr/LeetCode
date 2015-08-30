public class Solution {
    public int[][] generateMatrix(int n) {
        int value = 1;
        int count = 0;
        int[][] matrix = new int[n][n];
        while(value <= n*n) {
            for(int i=count; i<n-count; i++) {
                matrix[count][i] = value;
                value++;
            }
            for(int i=count+1; i<n-count; i++) {
                matrix[i][n-count-1] = value;
                value++;
            }
            for(int i=n-count-2; i>=count; i--) {
                matrix[n-count-1][i] = value;
                value++;
            }
            for(int i=n-count-2; i>=count+1; i--) {
                matrix[i][count] = value;
                value++;
            }
            count++;
        }
        return matrix;
    }
}
