public class Solution {
    public int findPeakElement(int[] nums) {
        int length = nums.length;
        if(length == 1) {
            return 0;
        }
        int left = 0;
        int right = length-1;
        while(left < right) {
            int mid = (left + right)>>1;
            if(nums[mid] < nums[mid+1]) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return left;
    }
}
