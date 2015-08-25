public class Solution {
    public double myPow(double x, int n) {
        if(n == 0){
            return 1;
        }
        if(n == 1) {
            return x;
        }
        boolean flag = false;
        if(n<0) {
            flag = true;
            n = n*-1;
        }
        int m = n>>1;
        double half = myPow(x,m);
        double ret = half*half;
        if((n&1) == 1) {
            ret = ret*x;
        } 
        if(flag) {
            ret = 1/ret;
        }    
        return ret;
        
    }
}
