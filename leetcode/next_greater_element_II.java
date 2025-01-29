package leetcode;

import java.util.*;

public class next_greater_element_II {
    public static int[] nextGreaterElements(int[] nums) {
        int[] res = new int[nums.length];
        Stack<Integer> st = new Stack<>();

        int n = nums.length;

        // Traversing given array two times and storing index of element not the element
        // itself in the stack.
        for (int i = 2 * n - 1; i >= 0; i--) {
            while (!st.empty() && nums[st.peek()] <= nums[i % n]) {
                st.pop();
            }

            res[i % n] = st.empty() ? -1 : nums[st.peek()];

            st.push(i % nums.length);
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 6, 5, 3 };
        nextGreaterElements(nums);
    }
}
