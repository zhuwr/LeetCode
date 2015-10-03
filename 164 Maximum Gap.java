public class Solution {
    public int maximumGap(int[] nums) {
        if(nums.length<2) {
            return 0;
        }
        int minnum = nums[0];
        int maxnum = nums[0];
        for(int i=1; i<nums.length; i++) {
            minnum = Math.min(minnum, nums[i]);
            maxnum = Math.max(maxnum, nums[i]);
        }
        if(maxnum == minnum) {
            return 0;
        }
        boolean[] isInbox = new boolean[nums.length+1];
        int[] maxVal = new int[nums.length+1];
        int[] minVal = new int[nums.length+1];
        
        for(int i=0; i<nums.length; i++) {
            int n = (int)(nums.length*1.0*(nums[i]-minnum)/(maxnum-minnum));
            if(n > nums.length) {
                n = nums.length;
            } else if(n <0) {
                n = 0;
            }
            if(!isInbox[n]) {
                isInbox[n] = true;
                maxVal[n] = nums[i];
                minVal[n] = nums[i];
            } else {
                maxVal[n] = Math.max(maxVal[n], nums[i]);
                minVal[n] = Math.min(minVal[n], nums[i]);
            }
        }
        int lastnum = -1;
        int ret = 0;
        for(int i=0; i<=nums.length; i++) {
            if(isInbox[i]) {
                if(lastnum == -1) {
                    lastnum = maxVal[i];
                } else {
                    ret = Math.max(ret,minVal[i] - lastnum);
                    lastnum = maxVal[i];
                }
            } else {
                continue;
            }
        }
        return ret;
    }
    
    public double multi(int x, int y, int z) {
        return (x*y/z);
    }
}
