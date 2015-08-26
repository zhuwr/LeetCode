public class Solution {
    public int[] searchRange(int[] nums, int target) {
        boolean flag = false;
        int left = 0, right = nums.length-1, mid = 0;
        
        while(left <= right) {
            mid = (left + right)>>1;
            if(nums[mid] < target) {
                left = mid + 1;
            } else if(nums[mid] > target) {
                right = mid - 1;
            } else {
                flag = true;
                left = mid;
                right = mid;
                while(left>=0 && nums[left] == target) {
                    left--;
                }
                while(right<nums.length && nums[right] == target) {
                    right++;
                }
                break;
            }
        }
        int[] result = new int[2];
        if(flag) {
            result[0] = left+1;
            result[1] = right-1;
        } else {
            result[0] = -1;
            result[1] = -1;
        }
        return result;
    }
}
