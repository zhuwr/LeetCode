public class Solution {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) {
            return false;
        }
        int farthest = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (i <= farthest && nums[i] + i >= farthest) {
                farthest = nums[i] + i;
            }
        }
        return farthest >= nums.length - 1;
    }
}
