public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length == 0) {
            return;
        }
        int length = nums.length;
        int index = -1;
        for(int i=length-1; i>=1; i--) {
            if(nums[i] > nums[i-1]) {
                index = i - 1;
                break;
            }
        }
        if(index == -1) {
            swap(nums, 0, length-1);
            return;
        }
        int bigger = length - 1;
        for(; bigger>index; bigger--) {
            if(nums[bigger] > nums[index]) {
                break;
            }
        }
        int temp = nums[index];
        nums[index] = nums[bigger];
        nums[bigger] = temp;
        swap(nums, index+1, length-1);
    }
    
    public void swap(int[] nums, int left, int right) {
        while(left < right) {
            int temp = nums[left];
            nums[left] = nums[right];
            nums[right] = temp;
            left++;
            right--;
        }
    }
}
