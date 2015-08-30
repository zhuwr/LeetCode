public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        combine(1, n, k, result, path);
        return result;
    }
    
    public void combine(int start, int n, int k, List<List<Integer>> result, List<Integer> path) {
        if(k == 0) {
            result.add(new ArrayList(path));
            return;
        }
        
        for(int i=start; i<=n; i++) {
            path.add(i);
            combine(i+1, n, k-1, result, path);
            path.remove(path.size()-1);
        }
    }
}
