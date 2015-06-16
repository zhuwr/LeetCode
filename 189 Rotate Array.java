public class Solution {
    public void rotate(int[] nums, int k) {
        if(k == 0) {
            return;
        }
        int length = nums.length;
        k = k%length;
        int[] temp = new int[k];
        int i;
        for(i=0; i<k; i++) {
           temp[i] = nums[length-k+i];
        }
        
        for(i=length-k-1; i>=0; i--) {
            nums[i+k] = nums[i];
        }
        for(i=0; i<k; i++) {
           nums[i] = temp[i];
        }
        
    }
}
