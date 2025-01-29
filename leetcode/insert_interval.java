package leetcode;

import java.util.ArrayList;

public class insert_interval {
    public static int[][] insert(int[][] intervals, int[] newInterval) {
        ArrayList<int[]> list = new ArrayList<>();

        int i = 0;
        int n = intervals.length;

        while (i < n && newInterval[0] > intervals[i][1]) {
            list.add(intervals[i]);
            i++;
        }

        while (i < n && intervals[i][0] <= newInterval[1]) {
            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            i++;
        }

        list.add(newInterval);

        while (i < n) {
            list.add(intervals[i]);
            i++;

        }
        // Converting list to a 2D array
        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 3, 5 }, { 6, 7 }, { 8, 10 }, { 12, 16 } };
        int newInterval[] = { 4, 8 };
        System.out.println(insert(intervals, newInterval));
    }
}
