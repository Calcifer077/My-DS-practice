import java.util.*;

public class find_all_duplicates_in_an_array {
    public static List<Integer> findDuplicates(int[] nums) {

        /*
         * 
         * List<Integer> res = new ArrayList<>();
         * 
         * HashMap<Integer, Integer> map = new HashMap<>();
         * for (int i = 0; i < nums.length; i++) {
         * map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
         * }
         * 
         * for (int i : map.keySet()) {
         * if (map.get(i) == 2) {
         * res.add(i);
         * }
         * }
         * 
         * return res;
         */

        /*
         * 
         * 
         * List<Integer> res = new ArrayList<>();
         * 
         * HashSet<Integer> set = new HashSet<>();
         * 
         * for (int i = 0; i < nums.length; i++) {
         * if (set.contains(nums[i])) {
         * res.add(nums[i]);
         * } else {
         * set.add(nums[i]);
         * }
         * }
         * 
         * return res;
         */

        // In the below approach what we are doing is that:
        // All elements in the array will be in range [1, n] and some of them occurs
        // twice
        // If we encounter any element, change its value at that position. Make it
        // negative.
        // If we come again at that index, it will mean that someone other has already
        // changed it meaning that there occurs two of them.
        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[Math.abs(nums[i]) - 1] < 0) {
                res.add(Math.abs(nums[i]));
            }
            nums[Math.abs(nums[i]) - 1] = -nums[Math.abs(nums[i]) - 1];
        }

        return res;

    }

    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicates(nums));
    }
}
