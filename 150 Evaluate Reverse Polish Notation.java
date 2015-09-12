public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> myStack = new Stack<Integer>();
        String operator = "+-*/";
        for(int i=0; i<tokens.length; i++) {
            if(operator.contains(tokens[i])) {
                int n = myStack.pop();
                int m = myStack.pop();
                if(tokens[i].equals("+")) {
                    myStack.push(m+n);
                } else if(tokens[i].equals("-")) {
                    myStack.push(m-n);
                } else if(tokens[i].equals("*")) {
                    myStack.push(m*n);
                } else {
                    myStack.push(m/n);
                }
            } else {
                myStack.push(Integer.parseInt(tokens[i]));
            }
        }
        return myStack.pop();
    }
}
