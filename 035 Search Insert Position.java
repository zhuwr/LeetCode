public class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length-1;
        
        while(left < right) {
            int mid = (left+right)>>1;
            if(nums[mid]==target) {
                return mid;
            } else if(nums[mid]<target){
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        if(target <= nums[left]) {
            return left;
        } else if(target>nums[right]){
            return right +1;
        } else {
            return right;
        }
    }
}
