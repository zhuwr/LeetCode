public class Solution {
    public int findKthLargest(int[] nums, int k) {
        if(nums.length == 0 || k > nums.length) {
            return -1;
        }
        int start = 0;
        int end = nums.length-1;
        while(start < end) {
            int index = Partition(nums, start, end);
            if(index > k-1) {
                end = index -1;
            } else if(index < k-1) {
                start = index + 1;
            } else {
                return nums[index];
            }
        }
        return nums[start];
    }
    public int Partition(int[] nums, int start, int end) {
        int value = nums[end];
        int index = start - 1;
        for(int i=start; i<end; i++) {
            if(nums[i] > value) {
                index++;
                if(i != index) {
                    swap(nums, i, index);
                }
            }
        }
        index++;
        swap(nums, index, end);
        return index;
    } 
    public void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
