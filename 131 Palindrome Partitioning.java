public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new ArrayList<List<String>>();
        List<String> path = new ArrayList<String>();
        getResult(result, path, s, 0);
        return result;
        
    }
    public void getResult(List<List<String>> result, List<String> path, String s,int start) {
        if(start == s.length()) {
            result.add(new ArrayList(path));
            return;
        }
        for(int i=start; i<s.length(); i++) {
            if(!isValid(s.substring(start,i+1))) {
                continue;
            }
            path.add(s.substring(start,i+1));
            getResult(result,path, s, i+1);
            path.remove(path.size()-1);
        }
    }
    public boolean isValid(String s) {
        int start = 0;
        int end = s.length()-1;
        while(start<end) {
            if(s.charAt(start)!= s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}
