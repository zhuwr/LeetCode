public class Solution {
    public int majorityElement(int[] nums) {
        int count = 1;
        int Maj = nums[0];
        for(int i=1; i<nums.length; i++) {
            if(nums[i] == Maj) {
                count++;
            } else {
                count--;
            }
            if(count == 0) {
                Maj = nums[i];
                count = 1;
            }
        }
        return Maj;
        
    }
}
