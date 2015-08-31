public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> num = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++) {
            if(num.contains(nums[i])) {
                return true;
            }
            num.add(nums[i]);
        }
        return false;
    }
}
