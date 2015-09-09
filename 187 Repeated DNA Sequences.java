public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        HashSet<String> help = new HashSet<String>();
        List<String> result = new ArrayList<String>();
        for(int i=0; i<s.length()-9; i++) {
            String temp = s.substring(i, i+10);
            if(help.contains(temp) && !result.contains(temp)) {
                result.add(temp);
            } else {
                help.add(temp);
            }
        }
        return result;
    }
}
