public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(n);
        while(n != 1) {
            n = next(n);
            if(set.contains(n)) {
                return false;
            }
            set.add(n);
        }
        return true;
    }
    public int next(int n) {
        int sum = 0;
        while(n != 0) {
            int temp = n%10;
            sum+= temp*temp;
            n = n/10;
        }
        return sum;
    }
}
