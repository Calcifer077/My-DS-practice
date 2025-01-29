package leetcode;

public class find_peak_element {
    public static int findPeakElement(int[] nums) {
        // Brute force

        /*
         * 
         * int n = nums.length;
         * if (n > 1) {
         * if (nums[0] > nums[1]) {
         * return 0;
         * }
         * if (nums[n - 1] > nums[n - 2]) {
         * return n - 1;
         * }
         * }
         * for (int i = 1; i < n - 1; i++) {
         * if (nums[i] > nums[i - 1] && nums[i] > nums[i + 1]) {
         * return i;
         * }
         * }
         * 
         * return 0;
         */

        // Optimized
        int n = nums.length;
        if (n > 1) {
            if (nums[0] > nums[1]) {
                return 0;
            }
            if (nums[n - 1] > nums[n - 2]) {
                return n - 1;
            }
        }

        int start = 0;
        int end = n - 1;

        while (start <= end) {
            int mid = (start + end) / 2;
            if (mid == 0) {
                return 0;
            } else if (mid == n - 1) {
                return n - 1;
            }
            if (nums[mid] > nums[mid - 1] && nums[mid] > nums[mid + 1]) {
                return mid;
            }

            if (nums[mid - 1] > nums[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }

        }
        return 0;

    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 1, 3, 5, 6, 4 };
        System.out.println(findPeakElement(nums));
    }
}
