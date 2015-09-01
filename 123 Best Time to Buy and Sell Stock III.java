public class Solution {
    public int maxProfit(int[] prices) {
        if(prices == null || prices.length == 0) {
            return 0;
        }
        int length = prices.length;
        int[] left = new int[length];
        int[] right = new int[length];
        int min_left = prices[0];
        int profit_left = 0;
        for(int i=1; i<length; i++) {
            left[i] = Math.max(left[i-1], prices[i] - min_left);
            min_left = Math.min(min_left, prices[i]);
        }
        
        int max_right = prices[length-1];
        int profit_right = 0;
        for(int i=length-2; i>=0; i--) {
            max_right = Math.max(max_right, prices[i]);
            right[i] = Math.max(right[i+1], max_right - prices[i]);
        }
        int result = 0;
        for(int i=0; i<length-1; i++) {
            result = Math.max(result, left[i] + right[i]);
        }
        return result;
    }
}
