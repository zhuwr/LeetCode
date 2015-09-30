public class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new ArrayList<String>();
        List<String> path = new ArrayList<String>();
        if(s.length()<4 || s.length()>12) {
            return result;
        }
        add(result, path, 0, s);
        return result;
    }
    public void add(List<String> result, List<String> path, int start, String s) {
        if(path.size()== 4) {
            if(start != s.length()) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            for(int i=0; i<path.size(); i++) {
                sb.append(path.get(i));
                sb.append(".");
            }
            sb.deleteCharAt(sb.length()-1);
            result.add(sb.toString());
            return;
        }
        for(int i=start+1; i<=s.length()&&i<=start+4; i++) {
            if(isValid(s.substring(start, i))) {
                path.add(s.substring(start, i));
                add(result, path, i, s);
                path.remove(path.size()-1);
            }
            
        }
    }
    public boolean isValid(String str) {
        if(str.charAt(0) == '0') {
            return str.equals("0");
        }
        int value = Integer.parseInt(str);
        return value>=0&&value<=255;
    }
}
