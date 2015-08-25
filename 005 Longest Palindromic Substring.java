public class Solution {
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) {
            return null;
        }
        int length = s.length();
        int maxCount = 1;
        int count = 1;
        int index = 0;
        String result = s.substring(0,1);
        for(int i=0; i<length; i++) {
            count = 1;
            index = 1;
            while(i-index>=0 && i+index<length && s.charAt(i-index)==s.charAt(i+index)) {
                index++;
                count += 2;
            }
            index--;
            if(count>maxCount) {
                maxCount = count;
                result = s.substring(i-index,i+index+1);
            }
            count = 0;
            index = 0;
            while(i-index>=0 && i+index+1<length && s.charAt(i-index)==s.charAt(i+index+1)) {
                index++;
                count +=2;
            }
            index--;
            if(count>maxCount) {
                maxCount = count;
                result = s.substring(i-index,i+index+2);
            }
        }
        return result;
    }
}
