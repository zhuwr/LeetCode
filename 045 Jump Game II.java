public class Solution {
    public int jump(int[] nums) {
        int start = 0, end = 0, max = 0, count = 0, length = nums.length-1;
        while(end < length) {
            count++;
            for(int i=start; i<=end; i++) {
                if(i + nums[i] > max) {
                    max = i + nums[i];
                }
            }
            start = end + 1;
            end = max;
        }
        return count;
    }
}
