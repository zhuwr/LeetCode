public class Solution {
    public int compareVersion(String version1, String version2) {
        
        String[] v1 = version1.split("\\.");
        String[] v2 = version2.split("\\.");
        int i=0;
        int leng1 = v1.length;
        int leng2 = v2.length;
        
        while(i < leng1 && i<leng2) {
            if(Integer.parseInt(v1[i]) >Integer.parseInt(v2[i])) {
                return 1;
            } else if(Integer.parseInt(v1[i]) <Integer.parseInt(v2[i])) {
                return -1;
            } else {
                i++;
            }
        }
        if(leng1 >leng2) {
            while(i < leng1) {
                if(Integer.parseInt(v1[i]) !=0) {
                    return 1;
                }
                i++;
            }
        } else if(leng1 < leng2) {
            while(i < leng2) {
                if(Integer.parseInt(v2[i]) !=0) {
                    return -1;
                }
                i++;
            }
        } 
        return 0;
    }
}
