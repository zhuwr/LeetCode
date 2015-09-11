public class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        if(triangle == null || triangle.size() == 0) {
            return 0;
        }
        if(triangle.size() == 1) {
            return triangle.get(0).get(0);
        }
        int m = triangle.size();
        int[][] sum = new int[m][m];
        for(int i=0; i<m; i++) {
            sum[m-1][i] = triangle.get(m-1).get(i);
        }
        
        for(int i=m-2; i>=0; i--) {
            for(int j=0; j<=i; j++) {
                sum[i][j] = triangle.get(i).get(j) + Math.min(sum[i+1][j],sum[i+1][j+1]);
            }
        }
        return sum[0][0];
    }
}
