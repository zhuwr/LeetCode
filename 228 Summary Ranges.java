public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int i = 0;
        List<String> ret = new ArrayList<String>();
        while(i < nums.length) {
            int start = i;
            int end = i;
            while(i<nums.length-1 && nums[i+1]-nums[i]==1) {
                end = ++i;
            }
            StringBuilder temp = new StringBuilder(); 
            if(start == end) {
                temp.append(nums[start]);
            } else {
                temp.append(nums[start]);
                temp.append("->");
                temp.append(nums[end]);
            }
            ret.add(temp.toString());
            i++;
        }
        return ret;
        
    }
}
