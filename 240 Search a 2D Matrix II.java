public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length ==0 || matrix[0].length == 0) {
            return false;
        }
        int m = matrix.length - 1;
        int n = matrix[0].length - 1;
        return search(matrix,target, 0, m, 0, n);
    }
    
    public boolean search(int[][] matrix, int target, int startx, int endx, int starty, int endy) {
        if(startx > endx || starty > endy) {
            return false;
        }
        if(matrix[startx][endy] == target) {
            return true;
        } else if(matrix[startx][endy] > target) {
            return search(matrix, target, startx, endx, starty, endy-1);
        } else {
            return search(matrix, target, startx+1, endx, starty, endy);
        }
    }
}
