public class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> myMap = new HashMap<Character, Integer>();
        if(s.length() != t.length()) {
            return false;
        }
        for(int i=0; i<s.length(); i++) {
            if(myMap.containsKey(s.charAt(i))) {
                int temp = myMap.get(s.charAt(i)) + 1;
                myMap.put(s.charAt(i), temp);
            } else {
                myMap.put(s.charAt(i),1);
            }
        }
        for(int i=0; i<t.length(); i++) {
            if(!myMap.containsKey(t.charAt(i)) || myMap.get(t.charAt(i))<=0) {
                return false;
            } else {
                int temp = myMap.get(t.charAt(i)) - 1;
                myMap.put(t.charAt(i), temp);
            }
        }
        return true;
    }
}
