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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        for(int i=0; i<intervals.size(); i++) {
            if(newInterval.start < intervals.get(i).start) {
                intervals.add(i, newInterval);
                break;
            }
            if(i == intervals.size()-1) {
                intervals.add(newInterval);
                break;
            }
        }
        List<Interval> result = new ArrayList<Interval>();
        if(intervals.size() == 0) {
            result.add(newInterval);
            return result;
        }
        Interval last = intervals.get(0);
        for(int i=1; i<intervals.size(); i++) {
            Interval curt = intervals.get(i);
            if(last.end >= curt.start) {
                last.end = Math.max(last.end, curt.end);
            } else {
                result.add(last);
                last = curt;
            }
        }
        result.add(last);
        return result;
    }
}
