public class Solution {
    public int rob(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int n = nums.length;
        int[] max = new int[n];
        int result = 0;
        if(n == 1) {
            return nums[0];
        }
        if(n == 2) {
            return Math.max(nums[0], nums[1]);
        }
        max[0] = nums[0];
        max[1] = Math.max(nums[0], nums[1]);
        for(int i=2; i<n; i++) {
            max[i] = Math.max(max[i-2]+nums[i], max[i-1]);
        }
        return max[n-1];
    }
}
