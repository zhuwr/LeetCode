public class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<Integer> path = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        help(nums, 0, path, result);
        return result;
    } 
    public void help(int[] nums, int start, List<Integer> path, List<List<Integer>> result) {
        if(start == nums.length) {
            result.add(new ArrayList(path));
            return;
        }
        
        for(int i=start; i<nums.length; i++) {
            swap(nums, start, i);
            path.add(nums[start]);
            help(nums, start+1, path, result);
            swap(nums, start, i);
            path.remove(start);
        }
        
    }
    public void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
}
