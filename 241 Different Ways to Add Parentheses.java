public class Solution {
    public List<Integer> diffWaysToCompute(String input) {
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                List<Integer> leftList = diffWaysToCompute(input.substring(0, i));
                List<Integer> rightList = diffWaysToCompute(input.substring(i+1));
                for(int m=0; m < leftList.size(); m++) {
                    for(int n=0; n<rightList.size(); n++) {
                        if(c =='+') {
                            result.add(leftList.get(m)+rightList.get(n));
                        }
                        if(c =='-') {
                            result.add(leftList.get(m)-rightList.get(n));
                        }
                        if(c =='*') {
                            result.add(leftList.get(m)*rightList.get(n));
                        }
                    }
                }
            }
        }
        if(result.isEmpty()) {
            result.add(Integer.parseInt(input));
        }
        return result;
    }
}
