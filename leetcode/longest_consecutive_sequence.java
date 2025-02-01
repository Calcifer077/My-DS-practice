import java.util.*;

public class longest_consecutive_sequence {
    public static boolean search(int nums[], int n) {
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                return true;
            }
        }
        return false;
    }

    public static int longestConsecutive(int[] nums) {
        // Brute force

        /*
         * 
         * int res = 0;
         * Arrays.sort(nums);
         * 
         * int n = 1;
         * for (int i = 1; i < nums.length; i++) {
         * if (nums[i] - nums[i - 1] == 1) {
         * n++;
         * } else {
         * res = Math.max(res, n);
         * }
         * }
         * 
         * res = Math.max(res, n);
         * 
         * return res;
         */

        // Using set to optimize
        int res = 0;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        for (int i : set) {
            if (!set.contains(i - 1)) {
                int n = 1;
                int x = i;
                while (set.contains(x + 1)) {
                    n++;
                    x++;
                }
                res = Math.max(res, n);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        System.out.println(longestConsecutive(nums));
    }
}
