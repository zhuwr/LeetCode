public class Solution {
    public String getPermutation(int n, int k) {
        int count = 1;
        String result="";
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<=n; i++) {
            sb.append(i);
        }
        k--;
        while(count <= n) {
            int now = step(n-count);
            result = result + sb.charAt(k/now);
            sb.deleteCharAt(k/now);
            k = k%now;
            count++;
        }
        return result;
    }
    public int step(int m) {
        int result = 1;
        for(int i=m; i>1; i--) {
            result *= i;
        }
        return result;
    }
}
