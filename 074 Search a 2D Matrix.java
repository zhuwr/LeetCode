public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        if(matrix.length == 1 && matrix[0].length == 1) {
            return matrix[0][0] == target;
        }
        int startX = 0;
        int endX = matrix.length - 1;
        int midX = 0;
        while(startX + 1 < endX) {
            midX = (startX + endX) >>1;
            if(matrix[midX][0] < target) {
                startX = midX;
            } else if(matrix[midX][0] > target) {
                endX = midX;
            } else {
                return true;
            }
        }
        if(target >= matrix[endX][0]) {
            startX = endX;
        } 
        int startY = 0;
        int endY = matrix[0].length - 1;
        int midY = 0;
        while(startY < endY) {
            midY = (startY + endY)>>1;
            if(matrix[startX][midY] < target) {
                startY = midY +1;
            } else if(matrix[startX][midY] > target) {
                endY = midY - 1;
            } else {
                return true;
            }
            
        }
        return matrix[startX][startY]== target;
    }
}
