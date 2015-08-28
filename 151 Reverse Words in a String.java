public class Solution {
    public String reverseWords(String s) {
        if(s == null || s.length() == 0) {
            return s;
        }
        String[] str = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for(int i=str.length-1; i>=0; i--) {
            if(!str[i].equals("")) {
                sb.append(str[i]).append(" ");
            }
        }
        return sb.length()>0? sb.substring(0, sb.length()-1): "";
    }
}
