public class Solution {
    public int longestValidParentheses(String s) {
        int result = 0, count = 0;
        Stack<Integer> myStack = new Stack<Integer>();
        boolean[] valid = new boolean[s.length()];
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i)=='(') {
                myStack.push(i);
            } else if (s.charAt(i)==')') {
                if(!myStack.isEmpty()) {
                    valid[i] = true;
                    valid[myStack.peek()] = true;
                    myStack.pop();
                }
            }
        }
        for(int i=0; i<s.length(); i++) {
            if(valid[i] == true) {
                count++;
            } else {
                result = Math.max(result, count);
                count = 0;
            }
        }
        result = Math.max(result, count);
        return result;
    }
}
