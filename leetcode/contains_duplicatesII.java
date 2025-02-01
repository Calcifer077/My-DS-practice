
import java.util.HashMap;

public class contains_duplicatesII {
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];

            if (map.containsKey(curr) && i - map.get(curr) <= k) {
                return true;
            }
            map.put(curr, i);
        }

        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, 1, 1 };
        System.out.println(containsNearbyDuplicate(nums, 1));
    }
}
