
import java.util.*;

public class merge_intervals {
    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        int n = intervals.length;

        // Sorting 'intervals' array as it might not be sorted.
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int current[] = intervals[0];
        list.add(current);

        for (int i = 1; i < n; i++) {
            int[] next = intervals[i];

            // If overlapping heppen, merge them.
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1]);
            } else {
                // No overlap
                current = next;
                list.add(current);
            }
        }

        return list.toArray(new int[list.size()][]);
    }

    public static void main(String[] args) {
        int intervals[][] = { { 1, 3 }, { 2, 6 }, { 8, 10 }, { 15, 18 } };
        merge(intervals);

    }
}
