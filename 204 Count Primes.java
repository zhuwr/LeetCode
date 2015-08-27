public class Solution {
    public int countPrimes(int n) {
        int count = 0;
        boolean[] isPrime = new boolean[n];
        for(int i=0; i<n; i++) {
            isPrime[i] = true;
        }
        
        for(int i=2; i*i<n; i++) {
            if(!isPrime[i]) {
                continue;
            }
            for(int j=i*i; j<n; j+=i) {
                isPrime[j] = false;
            }
        }
        for(int i=2; i<n; i++) {
            if(isPrime[i]) {
                count++;
            }
        }
        return count;
    }
}
