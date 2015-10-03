/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public List<Interval> merge(List<Interval> intervals) {
        List<Interval> result = new ArrayList<Interval>();
        if(intervals == null || intervals.size()<=1) {
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>(){
            public int compare(Interval a, Interval b) {
                return a.start - b.start;
            }
        });
        Interval curt = intervals.get(0);
        for(int i=1; i<intervals.size(); i++) {
            Interval next = intervals.get(i);
            if(curt.end >= next.start) {
                curt.end = Math.max(curt.end, next.end);
            } else {
                result.add(curt);
                curt = next;
            }
        }
        result.add(curt);
        return result;
    }
}
