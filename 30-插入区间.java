/**
 * Definition of Interval:
 * public classs Interval {
 *     int start, end;
 *     Interval(int start, int end) {
 *         this.start = start;
 *         this.end = end;
 *     }
 * }
 */

public class Solution {
    /**
     * @param intervals: Sorted interval list.
     * @param newInterval: new interval.
     * @return: A new interval list.
     */
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        // write your code here
        
        if (intervals == null || newInterval == null) {
            return intervals;
        }
        
        List<Interval> result = new ArrayList<>();
        int insertPos = 0;
        
        for (Interval interval : intervals) {
            if (interval.end < newInterval.start) {
                ++insertPos;
                result.add(interval);
            } else if (interval.start > newInterval.end) {
                result.add(interval);
            } else {
                newInterval.start = Math.min(newInterval.start, interval.start);
                newInterval.end = Math.max(newInterval.end, interval.end);
            }
        }
        
        result.add(insertPos, newInterval);
        
        return result;
    }
}