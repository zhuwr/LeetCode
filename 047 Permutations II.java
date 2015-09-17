public class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Permute(path, result, 0, nums);
        return result;
    }
    public void Permute(List<Integer> path, List<List<Integer>> result, int start, int[] nums) {
        if(start == nums.length) {
            result.add(new ArrayList(path));
            return;
        }
        for(int i=start; i<nums.length; i++) {
            if(Contains(nums, start, i)) {
                continue;
            }
            path.add(nums[i]);
            swap(nums, start, i);
            Permute(path, result, start+1, nums);
            swap(nums, start, i);
            path.remove(path.size()-1);
        }
    }
    public void swap(int[] nums, int m, int n) {
        int temp = nums[m];
        nums[m] = nums[n];
        nums[n] = temp;
    }
    public boolean Contains(int[] nums, int start, int i) {
        for(int j=start; j<i; j++) {
            if(nums[j] == nums[i]) {
                return true;
            }
        }
        return false;
    }
}
