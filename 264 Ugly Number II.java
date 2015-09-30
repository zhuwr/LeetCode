public class Solution {
    public int nthUglyNumber(int n) {
        int count2=0, count3=0, count5=0;
        int[] ugly = new int[n];
        ugly[0] = 1;
        for(int i=1; i<n; i++) {
            ugly[i] = min(ugly[count2]*2, ugly[count3]*3, ugly[count5]*5);
            while(ugly[count2]*2<=ugly[i]) {
                count2++;
            }
            while(ugly[count3]*3<=ugly[i]) {
                count3++;
            }
            while(ugly[count5]*5<=ugly[i]) {
                count5++;
            }
        }
        return ugly[n-1];
    }
    public int min(int a, int b, int c) {
        int m = Math.min(a,b);
        return Math.min(m,c);
    }
}
