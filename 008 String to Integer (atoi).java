public class Solution {
    public int myAtoi(String str) {
        if(str == null || str.length()==0) {
            return 0;
        }
        long sum = 0;
        int flag = 1;
        int index = 0;
        while(str.charAt(index) == ' ') {
            index++;
        }
        if(str.charAt(index) == '-') {
            flag = -1;
            index++;
        }else if(str.charAt(index) == '+') {
            index++;
        }
        
        for(int i=index; i<str.length(); i++) {
            if(str.charAt(i) == '-' || str.charAt(i) == '+') {
                return 0;
            }
            if(str.charAt(i) <'0' || str.charAt(i) >'9') {
                break;
            }
            sum = sum*10 + (str.charAt(i) - '0');
            if(sum >= Integer.MAX_VALUE) {
                break;
            }
        }
        if (sum*flag  >= Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        if (sum*flag <= Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        return (int)sum*flag;
    }
}
