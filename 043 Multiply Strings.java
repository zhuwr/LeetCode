public class Solution {
    public String multiply(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        if(num1 == null || num2 == null) {
            return null;
        }
        int l1 = num1.length();
        int l2 = num2.length();
        int l3 = l1 + l2, i=0, j=0;
        int[] num3 = new int[l3];
        int product = 0;
        for(i=l1-1; i>=0; i--) {
            int flag = 0;
            for(j=l2-1; j>=0; j--) {
                product = flag + num3[i+j+1] + (num1.charAt(i)-'0') * (num2.charAt(j)-'0');
                flag = product /10;
                num3[i+j+1] = product%10;
            }
            num3[i+j+1] = flag;
        }
        i=0;
        while(i<l3-1 && num3[i] == 0) {
            i++;
        }
        while(i<l3) {
            sb.append(num3[i++]);
        }
        return sb.toString();
    }
}
