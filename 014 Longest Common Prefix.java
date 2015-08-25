public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length ==0) {
            return "";
        }
        int minLen = Integer.MAX_VALUE;
        for(int i=0; i<strs.length; i++) {
            minLen = Math.min(minLen, strs[i].length());
        }
        for(int i=0; i<minLen; i++) {
            char c = strs[0].charAt(i);
            for(int j=1; j<strs.length; j++) {
                if(strs[j].charAt(i) != c) {
                    return i>0?strs[0].substring(0,i):"";
                }
            }
        }
        return strs[0].substring(0,minLen);
    }
}
