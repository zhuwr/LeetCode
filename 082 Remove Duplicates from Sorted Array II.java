public class Solution {
    public int removeDuplicates(int[] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int count = 0;
        int times = 1;
        int value = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == value) {
                times++;
                if(times >2) {
                    count++;
                } else {
                    nums[i-count] = nums[i];
                }
            } else {
                times = 1;
                nums[i-count] = nums[i];
                value = nums[i];
            }
        }
        return (nums.length - count);
    }
}
