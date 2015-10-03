public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, left = 0;
        Set<Character> set = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            if(!set.contains(s.charAt(i))) {
                set.add(s.charAt(i));
                max = Math.max(max, i-left+1);
            } else {
                while(set.contains(s.charAt(i))) {
                    set.remove(s.charAt(left));
                    left++;
                }
                i--;
            }
        }
        return max;
    }
}
