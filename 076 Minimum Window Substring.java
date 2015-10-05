public class Solution {
    public String minWindow(String s, String t) {
        int[] tNum = new int[256];
        int[] sNum = new int[256];
        int count = Integer.MAX_VALUE;
        String result = "";
        for(int i=0; i<t.length(); i++) {
            tNum[t.charAt(i)]++;
        }
        int right = 0;
        for(int i=0; i<s.length(); i++) {
            while(!Valid(sNum, tNum)&& right<s.length()) {
                sNum[s.charAt(right)]++;
                right++;
                if(right>=s.length()) {
                    break;
                }
            }
            
            if(Valid(sNum, tNum)&&right-i < count) {
                count = Math.min(count, right-i);
                result = s.substring(i, right);
            }
            
            sNum[s.charAt(i)]--;
        }
        return result;
    }
    public boolean Valid(int[] sNum, int[] tNum) {
        for(int i=0; i<256; i++) {
            if(sNum[i]<tNum[i]) {
                return false;
            }
        }
        return true;
    }
}
