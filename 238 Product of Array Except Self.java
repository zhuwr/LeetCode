public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        
        result[0] = 1;
        for(int i=1; i<nums.length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }
        int after = nums[nums.length-1];
        for(int i=nums.length-2; i>=0; i--) {
            result[i] = result[i] * after;
            after *= nums[i];
        }
        return result;
    }
}
