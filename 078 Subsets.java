public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(nums);
        for(int i=0; i<=nums.length; i++) {
            helper(0, i, path, result, nums);
        }
        return result;
    }
    public void helper(int start, int end, List<Integer> path, List<List<Integer>> result, int[] nums) {
        if(start == end) {
            result.add(new ArrayList<Integer>(path));
            return;
        }
        
        for(int i=start; i<end; i++) {
            path.add(nums[i]);
            helper(i+1, end, path, result, nums); 
            path.remove(path.size()-1);
        }
    }
}
