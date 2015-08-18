public class Solution {
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        int flag = 0;
        for(int i=length-1; i>=0; i--) {
            if(i == length-1) {
                digits[i]++;
            }
            digits[i] = (digits[i] + flag);
            flag = digits[i]/10;
            digits[i] = digits[i]%10;
        }
        if(flag == 1) {
            int[] ret = new int[length+1];
            for(int i=0; i<length; i++) {
                ret[i+1] = digits[i];
                ret[0] = flag;
            }
            return ret;
        }
        return digits;
    }
}
