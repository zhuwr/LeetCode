public class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> path = new ArrayList<Integer>();
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        if(numRows <= 0) {
            return result;
        }
        path.add(1);
        result.add(path);
        for(int i=1; i<numRows; i++) {
            List<Integer> temp = new ArrayList<Integer>();
            List<Integer> prev = result.get(i-1);
            temp.add(1);
            for(int j=0; j<prev.size()-1; j++) {
                temp.add(prev.get(j) + prev.get(j+1));
            }
            temp.add(1);
            result.add(temp);
        }
        return result;
    }
}
