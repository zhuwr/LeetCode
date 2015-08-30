public class Solution {
    public int mySqrt(int x) {
        long low = 0; 
        long high = x;
        while(low <= high) {
            long mid = low + (high - low)/2;
            if(x > mid * mid) {
                low = mid + 1;
            } else if(x < mid * mid) {
                high = mid - 1;
            } else {
                return (int)mid;
            }
        }
        return (int)high;
    }
}
