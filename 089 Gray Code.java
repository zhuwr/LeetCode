public class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> result = new ArrayList<Integer>();
        result.add(0);
        for(int i=0; i<n; i++) {
            List<Integer> tempList = new ArrayList<Integer>(result);
            Collections.reverse(tempList);
            int temp = 1<<i;
            for(int j=0; j<tempList.size(); j++) {
                tempList.set(j, tempList.get(j) + temp);
            }
            result.addAll(tempList);
        }
        return result;
    }
}
