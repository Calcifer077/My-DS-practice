import java.util.Arrays;
import java.util.Stack;

public class sum_of_subarray_ranges {
    public static long subArrayRanges(int[] nums) {
        /*
         * 
         * // Brute force
         * // Find all subarrays and find ranges.
         * // Range -> Maximum value - Minimum value
         * long res = 0;
         * 
         * int n = nums.length;
         * for (int i = 0; i < n; i++) {
         * for (int j = i; j < n; j++) {
         * int max = Integer.MIN_VALUE;
         * int min = Integer.MAX_VALUE;
         * 
         * for (int k = i; k <= j; k++) {
         * max = Math.max(max, nums[k]);
         * min = Math.min(min, nums[k]);
         * }
         * 
         * res += (max - min);
         * }
         * }
         * 
         * return res;
         */

        // A very stupid idea
        // Using 'Sum of Subarray minimum'

        // Find sum of subarray minimum and sum of subarray maximum.
        Stack<Integer> st = new Stack<>();
        int n = nums.length;
        long[] left = new long[n];
        long[] right = new long[n];

        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        // Find previous smaller element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] >= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();
        // Find next smaller element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] > nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }
        st.clear();

        long min = 0;
        for (int i = 0; i < n; i++) {
            min += (i - left[i]) * (right[i] - i) * nums[i];
        }

        /*
        *
        *
        *
        *
        *
        *
        */

        // For finding max
        Arrays.fill(left, -1);
        Arrays.fill(right, n);

        // Find previous greater element
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && nums[st.peek()] <= nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                left[i] = -1;
            } else {
                left[i] = st.peek();
            }

            st.push(i);
        }

        st.clear();
        // Find next greater element
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[st.peek()] < nums[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        long max = 0;
        for (int i = 0; i < n; i++) {
            max += (i - left[i]) * (right[i] - i) * nums[i];
        }

        long res = max - min;
        return res;
    }
}
