public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for(int i=0; i<nums.length-3; i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int a = nums[i];
            for(int j=i+1; j<nums.length-2; j++) {
                if(j>i+1 && nums[j] == nums[j-1]) {
                    continue;
                }
                int b = nums[j];
                int start = j+1;
                int end = nums.length-1;
                while(start < end) {
                    if(start>j+1 && nums[start] == nums[start-1]) {
                        start++;
                        continue;
                    }
                    if(end<nums.length-1 && nums[end] == nums[end+1]) {
                        end--;
                        continue;
                    }
                    int sum = a + b + nums[start] + nums[end];
                    if(sum > target) {
                        end--;
                    } else if(sum < target) {
                        start++;
                    } else {
                        ArrayList<Integer> fourSum = new ArrayList<Integer>();
                        fourSum.add(a);
                        fourSum.add(b);
                        fourSum.add(nums[start]);
                        fourSum.add(nums[end]);
                        result.add(fourSum);
                        start++;
                        end--;
                    }
                }
            }
        }
        return result;
    }
}
