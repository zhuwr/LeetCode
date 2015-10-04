public class Solution {
    public String largestNumber(int[] nums) {
        String[] strNum = new String[nums.length];
        for(int i=0; i<nums.length; i++) {
            strNum[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(strNum, new Comparator<String>() {
            public int compare(String a, String b) {
                return (a+b).compareTo(b+a);
            }
        });
        String result = "";
        for(int i=nums.length-1; i>=0; i--) {
            result = result + strNum[i];
        }
        int index = 0;
        while(index<result.length() && result.charAt(index)=='0') {
            index++;
        }
        if(index == result.length()) {
            return "0";
        }
        return result;
    }
}
