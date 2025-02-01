
import java.util.*;

public class next_greater_element_I {
    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums2.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        Stack<Integer> st = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && st.peek() <= nums2[i]) {
                st.pop(); // Maintain elements larger than nums2[i]
            }
            map.put(nums2[i], st.isEmpty() ? -1 : st.peek()); // Map next greater element or -1
            st.push(nums2[i]); // Add current element to stack
        }

        int res[] = new int[nums1.length];

        for (int i = 0; i < nums1.length; i++) {
            res[i] = map.get(nums1[i]);
        }

        return res;

    }

    public static void main(String[] args) {
        int nums1[] = { 4, 1, 2 };
        int nums2[] = { 1, 3, 4, 2 };
        System.out.println(nextGreaterElement(nums1, nums2));
    }
}
