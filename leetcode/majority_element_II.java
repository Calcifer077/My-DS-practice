
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class majority_element_II {
    // Brute force approach
    /*
     * 
     * public static List<Integer> majorityElement(int[] nums) {
     * List<Integer> res = new ArrayList<>();
     * 
     * HashMap<Integer, Integer> map = new HashMap<>();
     * for (int i = 0; i < nums.length; i++) {
     * if (map.containsKey(nums[i])) {
     * map.put(nums[i], map.get(nums[i]) + 1);
     * } else {
     * map.put(nums[i], 1);
     * }
     * }
     * 
     * for (int i : map.keySet()) {
     * if (map.get(i) > nums.length / 3) {
     * res.add(i);
     * }
     * }
     * 
     * return res;
     * }
     */

    // Solving using Boyer-moore voting alogrithm
    public static List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<>();

        int count = 0, candidate = -1;
        for (int i = 0; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else {
                if (nums[i] == candidate) {
                    count++;
                } else {
                    count--;
                }
            }
        }

        count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate) {
                count++;
            }

            if (count > nums.length / 3) {
                res.add(nums[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));
    }
}
