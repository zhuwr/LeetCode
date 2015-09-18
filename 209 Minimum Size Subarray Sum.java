public class Solution {
    public int minSubArrayLen(int s, int[] nums) {
        int result = Integer.MAX_VALUE, sum = 0;
        for(int i=0, j=0; i<nums.length; i++) {
            while(j<nums.length && sum <s) {
                sum += nums[j];
                j++;
            }
            if(sum >= s) {
                result = Math.min(result, j-i);
                sum -= nums[i];
            }
        }
        if(result == Integer.MAX_VALUE) {
            return 0;
        }
        return result;
    }
}
