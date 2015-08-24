public class Solution {
    public void sortColors(int[] nums) {
        int left = 0;
        int right = nums.length-1;
        int i=0;
        while(i <= right) {
            if(nums[i] == 0) {
                swap(nums, i, left);
                left++;
                i++;
            }else if(nums[i] == 1) {
                i++;
            } else {
                swap(nums, i, right);
                right--;
            }
        }
    }
    public void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    } 
}
