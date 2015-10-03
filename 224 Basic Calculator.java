public class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;
        Stack<Integer> stack = new Stack<Integer>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) =='+') {
                sign = 1;
            } else if(s.charAt(i) == '-'){
                sign = -1;
            } else if(s.charAt(i)=='(') {
                stack.push(result);
                stack.push(sign);
                result = 0;
                sign = 1;
            } else if(s.charAt(i)==')'){
                result = stack.pop()*result + stack.pop();
            } else if(Character.isDigit(s.charAt(i))){
                int num = s.charAt(i)-'0';
                while(i+1<s.length()&& Character.isDigit(s.charAt(i+1))) {
                    num = 10*num + s.charAt(++i)-'0';
                }
                result = result + sign* num;
            }
        }
        return result;
    }
}
