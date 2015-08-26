public class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<String>();
        generate(result, "" ,n ,n);
        return result;
    }
    
    public void generate(List<String> result, String str, int left, int right) {
        if(left>right || left<0 || right<0) {
            return;
        }
        if(left == 0 && right == 0) {
            result.add(str);
            return;
        }
        generate(result, str+"(", left-1, right);
        generate(result, str+")", left, right-1);
    }
}
