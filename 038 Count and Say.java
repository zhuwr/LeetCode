public class Solution {
    public String countAndSay(int n) {
        String str = "1";
        
        for(int i=1; i<n; i++) {
            int count = 1;
            char[] result = str.toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int j=0; j<str.length(); j++) {
                while(j+1<str.length() && result[j] == result[j+1]) {
                    count++;
                    j++;
                }
                sb.append(String.valueOf(count));
                sb.append(String.valueOf(result[j]));
                count = 1;
            }
            str = sb.toString();
        }
        return str;
    }
}
