import java.util.*;

public class number_of_boomerangs {
    // To calculate distance
    public long calDistance(int a[], int b[]) {
        long dx = (b[0] - a[0]) * (b[0] - a[0]);
        long dy = (b[1] - a[1]) * (b[1] - a[1]);
        return dx + dy;
    }

    public int numberOfBoomerangs(int[][] points) {
        int n = points.length;
        if (n < 3) {
            return 0;
        }

        // What I have done is, find distance between all points and create pairs that
        // have the same distance between them.
        // HashMap is used to count frequency of such distances
        // And we calculate pairs by m * m - 1, 'm' being the number of times a
        // particular distance has occured.
        // Why j = i + 1 is not used as it also skips i == j because there can be some
        // case when i < j can also contribute to result.

        int res = 0;

        HashMap<Long, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j)
                    continue;
                long dist = calDistance(points[i], points[j]);

                map.put(dist, map.getOrDefault(dist, 0) + 1);
            }

            // Why are we using hashmap inside outer loop, beacuse for each index we are
            // considering 'i' as the center.
            // This helps us to calculate boomerang for each index seperately.

            for (long k : map.keySet()) {
                if (map.get(k) > 1) {
                    res += map.get(k) * (map.get(k) - 1);
                }
            }

            map.clear();
        }

        return res;
    }
}
