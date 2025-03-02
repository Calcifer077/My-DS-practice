import java.util.Collections;
import java.util.List;

public class minimum_processing_time {
    public static int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        int res = Integer.MIN_VALUE;

        // Sorting both 'processorTime' and 'tasks' in ascending order so that we can
        // apply the condition written below.
        Collections.sort(processorTime);
        Collections.sort(tasks);

        int tasksLen = tasks.size();
        int processorLen = processorTime.size();

        // What we will do is assign the task that take the longest time to the
        // processor that comes earliest.
        // As each processor have 4 cores meaning that it can handle 4 tasks at the same
        // time, so the time it will complete its work is 'processorTime.get(i) +
        // max(tasks)'
        // Find this times for each task and return the max of it.
        // We don't need to consider about if a processor has finished its work and
        // there are still some tasks left, because you can use a processor only one
        // time

        int i = 0;
        int j = 0;
        for (i = 0, j = tasksLen - 1; i < processorLen && j >= 0; i++, j -= 4) {
            res = Math.max(res, processorTime.get(i) + tasks.get(j));
        }

        return res;
    }
}
