public class Solution {
    public boolean isMatch(String s, String p) {
        if(s.length() == 0) {
            return emptyString(p);
        }
        if(p.length() == 0) {
            return false;
        }
        char s1 = s.charAt(0);
        char p1 = p.charAt(0);
        char p2 = 'x';
        if(p.length()>1) {
            p2 = p.charAt(1);
        }
        if(p2 =='*') {
            if(p1=='.'||s1 == p1) {
                return isMatch(s.substring(1), p)||isMatch(s, p.substring(2));
            } else {
                return isMatch(s, p.substring(2));
            }
        } else {
            if(p1=='.'||s1 == p1) {
                return isMatch(s.substring(1), p.substring(1));
            } else {
                return false;
            }
        }

    }
    public boolean emptyString(String p) {
        if(p.length()%2 != 0) {
            return false;
        }
        for(int i=1; i<p.length(); i +=2) {
            if(p.charAt(i)!='*') {
                return false;
            }
        }
        return true;
    }
}
