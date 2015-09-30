public class Solution {
    public int missingNumber(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int total = (1+nums.length)*nums.length/2;
        for(int i=0; i<nums.length; i++) {
            total -= nums[i];
        }
        return total;
    }
}
