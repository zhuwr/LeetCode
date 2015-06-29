public class Solution {
    public boolean isValid(String s) {
        if(s == null) {
            return true;
        }
        Stack<Character> myStack = new Stack<Character>();
        for(Character a:s.toCharArray()) {
            if("([{".contains(String.valueOf(a))) {
                myStack.push(a);
            }
            else if(a.equals(')')) {
                if(myStack.isEmpty() || myStack.peek()!='(')
                    return false;
                else
                    myStack.pop();
            }
            else if(a.equals(']')) {
                if(myStack.isEmpty() ||myStack.peek()!='[' )
                    return false;
                else
                    myStack.pop();
            }
            else if(a.equals('}')) {
                if(myStack.isEmpty() || myStack.peek()!='{')
                    return false;
                else
                    myStack.pop();
            }
            
        }
        return myStack.isEmpty();
        
    }
}
