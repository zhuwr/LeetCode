public class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int sum = 0;
        int result = Integer.MAX_VALUE;
        int dif = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            int left = i+1; 
            int right = nums.length-1;
            while(left < right) {
                sum = nums[i] + nums[left] + nums[right];
                if(sum - target >0) {
                    right--;
                } else if(sum - target <0) {
                    left++;
                } else {
                    return target;
                }
                if(Math.abs(sum - target) < dif) {
                    result = sum;
                    dif = Math.abs(sum - target);
                }
            }
        }
        return result;
    }
}
