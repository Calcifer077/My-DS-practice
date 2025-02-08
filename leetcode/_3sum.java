import java.util.*;

public class _3sum {
    public static List<List<Integer>> threeSum(int[] nums) {

        // Brute force - will give TLE

        /*
         * 
         * List<List<Integer>> res = new ArrayList<>();
         * 
         * Arrays.sort(nums);
         * 
         * int n = nums.length;
         * 
         * for (int i = 0; i < n - 1; i++) {
         * int x = nums[i];
         * HashSet<Integer> set = new HashSet<>();
         * for (int j = i + 1; j < n; j++) {
         * int y = nums[j];
         * int z = 0 - x - y;
         * if (set.contains(z)) {
         * List<Integer> curr = new ArrayList<>();
         * curr.add(x);
         * curr.add(y);
         * curr.add(z);
         * 
         * if (!res.contains(curr)) {
         * res.add(curr);
         * }
         * continue;
         * }
         * 
         * set.add(y);
         * }
         * }
         * 
         * return res;
         */

        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        // As the array is sorted.
        // If currSum is less than 0, then we increment left pointer and if it is more
        // than 0, we decrease the right pointer.

        for (int i = 0; i < n; i++) {
            // Below condition is to skip any duplicates as they are not allowed in answer
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int total = nums[i] + nums[j] + nums[k];

                if (total > 0) {
                    k--;
                } else if (total < 0) {
                    j++;
                } else {
                    res.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    j++;

                    // To skip any duplicates
                    while (nums[j] == nums[j - 1] && j < k) {
                        j++;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { -1, 0, 1, 2, -1, -4 };
        System.out.println(threeSum(nums));
    }

}