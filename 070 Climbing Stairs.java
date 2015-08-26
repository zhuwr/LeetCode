public class Solution {
    public int climbStairs(int n) {
        if(n == 1) {
            return 1;
        }
        if(n == 2) {
            return 2;
        }
        int result = 0;
        int left = 1;
        int right = 2;
        for(int i = 3; i<=n; i++) {
            result = left + right;
            left = right;
            right = result;
        }
        return result;
    }
}
