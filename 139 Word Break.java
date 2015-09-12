public class Solution {
    public boolean wordBreak(String s, Set<String> wordDict) {
        boolean[] result = new boolean[s.length()+1];
        result[0] = true;
        for(int i=0; i<s.length(); i++) {
            if(!result[i]) {
                continue;
            }
            for(String str:wordDict) {
                int length = str.length();
                int end = i + length;
                if(end > s.length()) {
                    continue;
                }
                if(s.substring(i,end).equals(str)) {
                    result[end] = true;
                }
            }
        }
        return result[s.length()];
    }
}
