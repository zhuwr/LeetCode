public class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        ArrayList<Set> course = new ArrayList<Set>();
        for(int i=0; i<numCourses; i++) {
            course.add(new HashSet<Integer>());
        }
        for(int i=0; i<prerequisites.length; i++) {
            course.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
        int[] preNum = new int[numCourses];
        for(int i=0; i<numCourses; i++) {
            Iterator<Integer> it = course.get(i).iterator();
            while(it.hasNext()) {
                preNum[it.next()]++;
            }
        }
        for(int i=0; i<numCourses; i++) {
            int j=0;
            for( ; j<numCourses; j++) {
                if(preNum[j]==0) {
                    break;
                }
            }
            if(j == numCourses) {
                return false;
            }
            preNum[j] = -1;
            Iterator<Integer> it = course.get(j).iterator();
            while(it.hasNext()) {
                preNum[it.next()]--;
            }
        }
        return true;
    }
}
