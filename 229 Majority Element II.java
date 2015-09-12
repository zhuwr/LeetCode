public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> result = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        int count1=0, count2=0, num1=0, num2=0;
        
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == num1) {
                count1++;
            } else if(nums[i] == num2) {
                count2++;
            } else if(count1 == 0) {
                count1 = 1;
                num1 = nums[i];
            } else if(count2 == 0) {
                count2 = 1;
                num2 = nums[i];
            } else {
                count1--;
                count2--;
            }
        }
        count1 = 0;
        count2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(nums[i] == num1) {
                count1++;
            } else if(nums[i] == num2) {
                count2++;
            }
        }
        if(3*count1 > nums.length) {
            result.add(num1);
        }
        if(3*count2 > nums.length) {
            result.add(num2);
        }
        return result;
    }
}
