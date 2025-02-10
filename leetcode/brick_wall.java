import java.util.*;

public class brick_wall {
    public static int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = wall.size();
        for (int i = 0; i < n; i++) {
            if (wall.get(i).size() > 1) {
                int sum = wall.get(i).get(0);

                for (int j = 1; j < wall.get(i).size() - 1; j++) {
                    sum += wall.get(i).get(j);
                    map.put(sum, map.getOrDefault(sum, 0) + 1);
                }
            }

        }

        int max = 0;

        for (int i : map.keySet()) {
            System.out.println(i + " " + map.get(i));
        }

        for (int i : map.keySet()) {
            if (map.get(i) > max) {
                max = map.get(i);
            }
        }

        return n - max;
    }
}
