public class Solution {
    public List<String> wordBreak(String s, Set<String> wordDict) {
        List<String> result = new ArrayList<String>();
        List<String> path = new ArrayList<String>();
        if(s == null || s.length()==0) {
            return result;
        }
        boolean[][] isWord = new boolean[s.length()][s.length()];
        for(int i=0; i<s.length(); i++) {
            for(int j=i; j<s.length(); j++) {
                String str = s.substring(i,j+1);
                isWord[i][j] = wordDict.contains(str);
            }
        }
        boolean[] isPossible = new boolean[s.length()+1];
        isPossible[s.length()] = true;
        for (int i = s.length() - 1; i >= 0; i--) {
            for (int j = i; j < s.length(); j++) {
                if (isWord[i][j] && isPossible[j + 1]) {
                    isPossible[i] = true;
                    break;
                }
            }
        }
        add(result, path, wordDict, s, 0, isWord, isPossible);
        return result;
    }
    public void add(List<String> result,List<String> path, Set<String> wordDict, String s, int start, boolean[][] isWord, boolean[] isPossible) {
        if(!isPossible[start]) {
            return;
        }
        if(start == s.length()) {
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<path.size(); i++) {
                sb.append(path.get(i));
                sb.append(" ");
            }
            sb.deleteCharAt(sb.length()-1);
            result.add(sb.toString());
            return;
        }
        for(int i=start; i<s.length(); i++) {
            if(isWord[start][i]) {
                path.add(s.substring(start, i+1)); 
                add(result, path, wordDict, s, i+1,isWord, isPossible);
                path.remove(path.size()-1); 
            }
        }
        
    }
}
