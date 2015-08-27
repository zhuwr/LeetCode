public class Solution {
    public int maxProfit(int[] prices) {
        int result = 0;
        int min = Integer.MAX_VALUE;
        for(int i: prices) {
            min = Math.min(min, i);
            result = Math.max(result, (i-min));
        }
        return result;
    }
}
