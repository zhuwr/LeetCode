public class Solution {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for(int i=2; i<=n; i++) {
            int min = Integer.MAX_VALUE;
            int j=1;
            while(j*j<=i) {
                if(j*j == i) {
                    min = 1;
                    break;
                }
                min = Math.min(min, dp[i-j*j]+1);
                j++;
            }
            dp[i] = min;
        }
        return dp[n];
    }
}
