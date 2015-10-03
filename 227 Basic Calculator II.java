public class Solution {
    public int calculate(String s) {
        int result = 0;
        int sign = 1;
        LinkedList<Integer> help = new LinkedList<Integer>();
        for(int i=0; i<s.length(); i++) {
            if(Character.isDigit(s.charAt(i))) {
                int num = s.charAt(i)-'0';
                while(i+1<s.length()&&Character.isDigit(s.charAt(i+1))) {
                    num = 10*num + s.charAt(++i)-'0';
                }
                if(!help.isEmpty()&&help.peek()==2) {
                    help.pop();
                    int temp = help.pop();
                    result = temp*num;
                    help.push(result);
                } else if(!help.isEmpty()&&help.peek()==3) {
                    help.pop();
                    int temp = help.pop();
                    result = temp/num;
                    help.push(result);
                } else {
                    help.push(num);
                }
            } else if(s.charAt(i)=='+'){
                help.push(1);
            } else if(s.charAt(i)=='-'){
                help.push(-1);
            } else if(s.charAt(i)=='*'){
                help.push(2);
            } else if(s.charAt(i)=='/'){
                help.push(3);
            }
        }
        sign = 1;
        Collections.reverse(help);
        if(!help.isEmpty()) {
            result = help.poll();
        }
        while(!help.isEmpty()) {
            sign = help.poll();
            result = result + sign*help.poll();
        }
        return result;
    }
}
