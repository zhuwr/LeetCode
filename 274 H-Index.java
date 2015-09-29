public class Solution {
    public int hIndex(int[] citations) {
        if(citations == null || citations.length == 0) {
            return 0;
        }
        int n = citations.length;
        int[] num = new int[n+1];
        for(int i=0; i<n; i++) {
            if(citations[i] >= n) {
                num[n]++;
            } else {
                num[citations[i]]++;
            }
        }
        if(num[n] == n) {
            return n;
        }
        for(int i=n-1; i>=0; i--) {
            num[i] += num[i+1];
            if(num[i] >= i) {
                return i;
            }
        }
        return 0;
    }
}
