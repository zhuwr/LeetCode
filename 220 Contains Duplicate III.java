public class Solution {
    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        SortedSet<Long> set = new TreeSet<Long>();
        if(nums == null || nums.length<=1||k<1||t<0) {
            return false;
        }
        for(int i=0; i<nums.length; i++) {
            SortedSet<Long> tempSet = set.subSet((long)nums[i]-t, (long)nums[i]+t+1);
            if(!tempSet.isEmpty()) {
                return true;
            }
            if(i>=k) {
                set.remove((long)nums[i-k]);
            }
            set.add((long)nums[i]);
        }
        return false;
    }
}
