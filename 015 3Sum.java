public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ret = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length; i++) {
            if(i!=0&&nums[i] == nums[i-1]) {
                continue;
            }
            int value = -nums[i];
            int start = i+1; 
            int end = nums.length-1;
            while(start < end) {
                if(nums[start] + nums[end]>value) {
                    end--;
                } else if(nums[start]+nums[end]<value) {
                    start++;
                } else {
                    List<Integer> ans = new ArrayList<Integer>();
                    ans.add(nums[i]);
                    ans.add(nums[start]);
                    ans.add(nums[end]);
                    ret.add(ans);

                    while(start<end&&nums[start]==nums[start+1]) {
                        start++;
                    }
                    while(start<end&&nums[end]==nums[end-1]) {
                        end--;
                    }
                    start++;
                    end--;
                }
            }
        }
        return ret;
    }
}
