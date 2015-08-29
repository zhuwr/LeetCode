public class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<Integer>();
        if(matrix == null || matrix.length ==0 || matrix[0].length == 0) {
            return result;
        }
        int m=matrix.length, n = matrix[0].length;
        int startx = 0, starty = 0;
        while(startx*2<m && starty*2<n) {
            for(int i=starty; i<n-starty; i++) {
                result.add(matrix[startx][i]);
            }
            for(int i=startx+1; i<m-startx; i++) {
                result.add(matrix[i][n-starty-1]);
            }
            if(m-startx*2 == 1 || n-starty*2 == 1) {
                break;
            }
            for(int i=n-starty-2; i>=starty; i--) {
                result.add(matrix[m-startx-1][i]);
            }
            for(int i=m-startx-2; i>startx; i--) {
                result.add(matrix[i][starty]);
            }
            startx++;
            starty++;
        }
        return result;
    }
}
