public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;
        for(int i=0; i<n;) {
            if(nums[i] == i+1) {
                i++;
            }else if(nums[i]<i+1 || nums[i]>n || nums[i] == nums[nums[i]-1]) {
                nums[i] = nums[--n];
                
            }else {
                int temp = nums[nums[i]-1];
                nums[nums[i]-1] = nums[i];
                nums[i] = temp;
            }
        }
        return n+1;
    }
}
