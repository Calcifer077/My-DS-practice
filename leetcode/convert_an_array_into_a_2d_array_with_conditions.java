import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class convert_an_array_into_a_2d_array_with_conditions {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        int count = 0;
        while (count < nums.length) {
            List<Integer> list = new ArrayList<>();
            for (int i : map.keySet()) {
                if (map.get(i) > 0) {
                    list.add(i);
                    map.put(i, map.get(i) - 1);
                }
            }

            res.add(new ArrayList<>(list));
        }

        return res;
    }
}
