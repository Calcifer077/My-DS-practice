import java.util.Arrays;

public class find_the_smallest_divisor_given_a_threshold {
    public static int smallestDivisor(int[] nums, int threshold) {
        // The question asks us to try out all positive integers
        // Find max possible value
        int max = Integer.MIN_VALUE;
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            max = Math.max(nums[i], max);
        }

        int start = 1;
        while (start < max) {
            int mid = (start + max) / 2;
            int sum = 0;

            // Calculate the sum of divisions rounded up
            for (int num : nums) {
                sum += (int) Math.ceil((double) num / mid);
            }

            // If sum is greater than threshold, we need a larger divisor
            if (sum > threshold) {
                start = mid + 1;
            } else {
                max = mid;
            }
        }
        return start;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 5, 9 };
        int threshold = 6;
        System.out.println(smallestDivisor(nums, threshold));
    }
}
