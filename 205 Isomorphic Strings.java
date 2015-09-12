public class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null || s.length() != t.length()) {
            return false;
        }
        Map<Character, Character> myMap = new HashMap<Character, Character>();
        Set<Character> mySet = new HashSet<Character>();
        for(int i=0; i<s.length(); i++) {
            if(myMap.containsKey(s.charAt(i))) {
                if(myMap.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            } else if(mySet.contains(t.charAt(i))) {
                return false;
            } else {
                myMap.put(s.charAt(i), t.charAt(i));
                mySet.add(t.charAt(i));
            }
        }
        return true;
    }
}
