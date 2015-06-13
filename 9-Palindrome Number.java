public class Solution {
    public boolean isPalindrome(int x) {
       if(x < 0) {
           return false;
       }
       return x == reverse(x);
    }
    
    public int reverse(int x) {
        int ret = 0;
        while(x != 0) {
            ret = ret*10 + x%10;
            x = x/10;
        }
        return ret;
    }
}
