public class Solution {
    public String simplifyPath(String path) {
        ArrayList<String> strList = new ArrayList<String>();
        String[] Path = path.split("/+");
        for(String str:Path) {
            if(str.equals("..") ) {
                if(strList.size()>0) {
                    strList.remove(strList.size()-1);
                }
            }else if(!str.equals(".") && !str.equals("")) {
                strList.add(str);
            }
        }
        String result = "/";
        for(int i=0; i<strList.size(); i++) {
            result +=  strList.get(i) + "/";
        }
        int length = result.length();
        if(length >1) {
            result = result.substring(0, length-1);
        }
        return result;
    }
}
