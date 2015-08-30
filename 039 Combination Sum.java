public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        helper(candidates, target, 0, path, result);
        return result;
    }
    public void helper(int[] candidates, int target, int index, List<Integer> path, List<List<Integer>> result) {
        if(target == 0) {
            result.add(new ArrayList<Integer>(path));
            return;
        }
        for(int i=index; i<candidates.length; i++) {
            if(candidates[i] > target) {
                break;
            }
            if(i>index && candidates[i]==candidates[i-1]) {
                continue;
            }
            path.add(candidates[i]);
            helper(candidates, target-candidates[i], i, path, result);
            path.remove(path.size() - 1);
        }
    }
}
