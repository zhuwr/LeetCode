public class Solution {
    public int[] singleNumber(int[] nums) {
        int total = 0;
        for(int i=0; i<nums.length; i++) {
            total ^= nums[i];
        }
        total = total ^(total&(total-1));
        int result1 = 0, result2 = 0;
        for(int i=0; i<nums.length; i++) {
            if((nums[i]&total) == 0) {
                result1 ^= nums[i];
            } else {
                result2 ^= nums[i];
            }
        }
        int[] result = new int[2];
        result[0] = result1;
        result[1] = result2;
        return result;
    }
}
