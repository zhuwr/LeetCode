public class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1 || s.length()<numRows) {
            return s;
        }
        
        char[] Rows =new char[s.length()];
        int count = 0;
        int step = 2*(numRows-1);
        for(int i=0; i<numRows; i++) {
            int interval = step - 2*i;
            for(int j=i; j<s.length(); j+=step) {
                Rows[count] = s.charAt(j);
                count++;
                if(interval>0 && interval<step&&j+interval<s.length()) {
                    Rows[count] = s.charAt(j+interval);
                    count++;
                }
            }
        }

        return new String(Rows);
        
    }
}
