public class Solution {
    public boolean isNumber(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<=end && s.charAt(start) == ' ') {
            start++;
        }
        if(start>end) {
            return false;
        }
        while(s.charAt(end) == ' ') {
            end--;
        }
        if(s.charAt(start) == '+' || s.charAt(start) == '-') {
            start++;
        }
        boolean num = false;
        boolean exp = false;
        boolean dot = false;
        while(start <= end) {
            if(s.charAt(start)-'0' >=0 && s.charAt(start)-'9'<=0) {
                num = true;
            } else if(s.charAt(start) == '.') {
                if( exp || dot) {
                    return false;
                }
                dot = true;
            } else if(s.charAt(start) =='e') {
                if(!num || exp) {
                    return false;
                }
                exp = true;
                num = false;
            } else if(s.charAt(start) == '+' || s.charAt(start) =='-') {
                if(s.charAt(start-1) != 'e') {
                    return false;
                }
            } else {
                return false;
            }
            start++;
        }
        return num;
    }
}
