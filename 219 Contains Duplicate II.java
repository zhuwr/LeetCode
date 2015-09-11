public class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Set<Integer> mySet = new HashSet<Integer>();
        int start = 0, end = 0;
        for(int i=0; i<nums.length; i++) {
            if(!mySet.contains(nums[i])) {
                mySet.add(nums[i]);
                end++;
            } else {
                return true;
            }
            if(end-start > k) {
                mySet.remove(nums[start]);
                start++;
            }
        }
        return false;
    }
}
