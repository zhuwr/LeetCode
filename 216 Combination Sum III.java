public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> path = new ArrayList<Integer>();
        help(1, k, 0, n,path, result);
        return result;
    }
    
    public void help(int start, int k, int now, int n, List<Integer> path, List<List<Integer>> result) {
        if(now > n || path.size() > k) {
            return;
        }
        if(now == n && path.size() == k) {
            result.add(new ArrayList(path));
            return;
        }
        for(int i=start; i<=9; i++) {
            path.add(i);
            now += i;
            help(i+1, k, now, n, path, result);
            now -= i;
            path.remove(path.size()-1);
        }
    }
}
