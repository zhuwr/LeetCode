public class Solution {
    public int countDigitOne(int n) {
        long curt = 1, result = 0 ;
        while(n >= curt) {
            long bit = n/curt%10;
            if(bit == 0) {
                result += n/curt/10 * curt;
            } else if(bit == 1) {
                result += n/curt/10 *curt + n%curt+1;
            } else {
                result += (n/curt/10+1)*curt;
            }
            curt *= 10;
        }
        return (int)result;
    }
}
