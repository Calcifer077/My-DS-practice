import java.util.*;

public class intervals_between_identical_elements {
    public static long[] getDistances(int[] arr) {
        int n = arr.length;
        long[] res = new long[n];

        // Storing indexes of a element with respect to that element.
        HashMap<Integer, List<Long>> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            if (!map.containsKey(arr[i])) {

                // If 'map' doesn't contain current element add a new list at that position.
                map.put(arr[i], new ArrayList<>());
            }

            // adding current element into list.
            map.get(arr[i]).add((long) i);
        }

        for (int i = 0; i < n; i++) {
            // Trverse a particular list and add their intervals.
            for (int j = 0; j < map.get(arr[i]).size(); j++) {
                res[i] += Math.abs(map.get(arr[i]).get(j) - i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 1, 3, 1, 2, 3, 3 };
        getDistances(arr);
    }
}
