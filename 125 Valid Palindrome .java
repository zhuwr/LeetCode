public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start < end) {
            if(!Character.isLetter(s.charAt(start)) && !Character.isDigit(s.charAt(start))) {
                start++;
                continue;
            }
            if(!Character.isLetter(s.charAt(end)) && !Character.isDigit(s.charAt(end))) {
                end--;
                continue;
            }
            if(Character.toLowerCase(s.charAt(start)) == Character.toLowerCase(s.charAt(end))) {
                start++;
                end--;
            } else {
                return false;
            }
        }
        return true;
        
    }
}
