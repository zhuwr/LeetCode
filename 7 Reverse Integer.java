public class Solution {
    public int reverse(int x) {
        int ret = 0;
        
        while(x != 0) {
            int next_ret = 10*ret + x%10;
            x = x/10;
            if(next_ret/10 != ret) {
                return 0;
            }
            ret = next_ret;
        }
        
        return ret;
    }
}
