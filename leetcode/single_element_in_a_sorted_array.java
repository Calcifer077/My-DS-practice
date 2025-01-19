package leetcode;

import java.util.*;

public class single_element_in_a_sorted_array {
    public static int singleNonDuplicates(int[] nums) {
        // Brute force

        /*
         * 
         * if (nums.length == 1) {
         * return nums[0];
         * }
         * 
         * if (nums[0] != nums[1]) {
         * return nums[0];
         * }
         * 
         * if (nums[nums.length - 1] != nums[nums.length - 2]) {
         * return nums[nums.length - 1];
         * }
         * 
         * for (int i = 1; i < nums.length - 1; i++) {
         * if (nums[i - 1] != nums[i] && nums[i] != nums[i + 1]) {
         * return nums[i];
         * }
         * }
         */

        if (nums.length == 1) {
            return nums[0];
        }

        if (nums[0] != nums[1]) {
            return nums[0];
        }

        if (nums[nums.length - 1] != nums[nums.length - 2]) {
            return nums[nums.length - 1];
        }

        int start = 1;
        int end = nums.length - 2;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (nums[mid] != nums[mid + 1] && nums[mid] != nums[mid - 1]) {
                return nums[mid];
            }

            // We are in the left half.
            if ((mid % 2 == 1 && nums[mid] == nums[mid - 1]) || (mid % 2 == 0 && nums[mid] == nums[mid + 1])) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicates(nums));
    }
}
