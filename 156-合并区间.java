package lintcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Interval> intervals = new ArrayList<>();
        intervals.add(new Interval(1, 4));
        intervals.add(new Interval(0, 2));
        intervals.add(new Interval(3, 5));
        for (Interval inter : merge(intervals)) {
            System.out.println(inter.start + " " + inter.end);
        }
    }

    public static List<Interval> merge(List<Interval> intervals) {
        // write your code here
        if (intervals == null || intervals.size() <= 1) {
            return intervals;
        }
        Collections.sort(intervals, new Comparator<Interval>() {
            @Override
            public int compare(Interval o1, Interval o2) {
                return o1.start - o2.start;
            }
        });

        List<Interval> list = new ArrayList<>();
        int min = intervals.get(0).start;
        int max = intervals.get(0).end;

        for (int i = 1; i < intervals.size(); ++i) {
            if (intervals.get(i).start <= max) {
                if (intervals.get(i).end >= max) {
                    max = intervals.get(i).end;
                }
            } else {
                list.add(new Interval(min, max));
                min = intervals.get(i).start;
                max = intervals.get(i).end;
            }
        }
        list.add(new Interval(min, max));

        return list;
    }
}


class Interval {
    int start, end;

    Interval(int start, int end) {
        this.start = start;
        this.end = end;
    }
}