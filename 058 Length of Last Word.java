public class Solution {
    public int lengthOfLastWord(String s) {
        if(s == null || s.length() == 0 ) {
            return 0;
        }
        int right = s.length()-1;
        while(right >= 0 && s.charAt(right) == ' ') {
            right--;
        }
        int left = right;
        while(left>=0 && s.charAt(left) != ' ' ) {
            left--;
        }
        return (right - left);
    }
}
