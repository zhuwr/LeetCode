public class Solution {
    public String addBinary(String a, String b) {
        if(a.length() > b.length()) {
            String temp = a;
            a = b;
            b = temp;
        }
        int la = a.length()-1;
        int lb = b.length()-1;
        int flag = 0, sum = 0;
        String result = "";
        
        while(la>=0) {
            sum = flag + (int)(a.charAt(la)-'0') + (int)(b.charAt(lb)-'0');
            flag = sum/2;
            result =  String.valueOf(sum%2) + result;
            la--;
            lb--;
        }
        while(lb>=0) {
            sum = flag + (int)(b.charAt(lb)-'0');
            flag = sum/2;
            result =  String.valueOf(sum%2) + result;
            lb--;
        }
        if(flag == 1) {
            result = "1" + result;
        }
        return result;
    }
}
