public class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums == null || nums.length == 0) {
            return new int[0];
        }
        int[] result = new int[nums.length-k+1];
        LinkedList<Integer> help = new LinkedList<Integer>();
        for(int i=0; i<nums.length; i++) {
            while(!help.isEmpty()&&nums[help.peekLast()]<nums[i]) {
                help.pollLast();
            }
            help.addLast(i);
            if(i- help.peekFirst()>=k) {
                help.pollFirst();
            }
            if(i>=k-1) {
                result[i-k+1] = nums[help.peekFirst()];
            }
        }
        return result;
    }
}
