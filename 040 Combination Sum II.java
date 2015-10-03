public class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        Arrays.sort(candidates);
        add(candidates, target, result, path, 0);
        return result;
    }
    public void add(int[] candidates, int target, List<List<Integer>> result, List<Integer> path, int start) {
        if(target == 0) {
            result.add(new ArrayList(path));
            return;
        }
        if(target <0) {
            return;
        }
        int last = -1;
        for(int i=start; i<candidates.length; i++) {
            if(candidates[i] == last) {
                continue;
            }
            path.add(candidates[i]);
            add(candidates, target-candidates[i], result, path, i+1);
            path.remove(path.size()-1);
            last = candidates[i];
        }
    }
}
