public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        if(nums == null || nums.length == 0) {
            return result;
        }
        Arrays.sort(nums);
        add(0, path, result, nums);
        return result;
    }
    public void add(int start, List<Integer> path, List<List<Integer>> result, int[] nums) {
        result.add(new ArrayList<Integer>(path));
        
        for(int i=start; i<nums.length; i++) {
            if(i != start && nums[i] == nums[i-1]) {
                continue;
            }
            path.add(nums[i]);
            add(i+1, path, result, nums);
            path.remove(path.size()-1);
        }
    }
}
