import java.util.Stack;

public class largest_rectangle_in_histogram {
    /*
     * 
     * public static int calcArea(int[] arr, int pos) {
     * // Find left end
     * int left = pos;
     * 
     * for (int i = pos; i >= 0; i--) {
     * if (arr[i] < arr[pos]) {
     * break;
     * }
     * left = i;
     * }
     * 
     * // Find right end
     * int n = arr.length;
     * int right = pos;
     * 
     * for (int i = pos; i < n; i++) {
     * if (arr[i] < arr[pos]) {
     * break;
     * }
     * right = i;
     * }
     * 
     * // Find area
     * int height = arr[pos];
     * int width = right - left + 1;
     * 
     * return height * width;
     * }
     */

    public static int largestRectangleArea(int[] heights) {
        // optimizing using stack
        // Find previous smaller element and next smaller element
        int n = heights.length;
        int left[] = new int[n];
        int right[] = new int[n];

        Stack<Integer> st = new Stack<>();
        for (int i = 0; i < n; i++) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
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

        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && heights[st.peek()] >= heights[i]) {
                st.pop();
            }

            if (st.isEmpty()) {
                right[i] = n;
            } else {
                right[i] = st.peek();
            }

            st.push(i);
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int r = -1;
            // We have to consider only the amount upto which the histogram can extend. If
            // it is equal to 'n' then that means that there is no smaller element than
            // itself on its right. So it can extend all the way to right 'n - 1'.
            if (right[i] != n) {
                r = right[i] - 1;
            } else {
                r = n - 1;
            }

            // If its value is '-1' then that means that there is no element that is smaller
            // than this element on its left, then we will consider '0' so it can extend all
            // the way to left.
            int l = -1;
            if (left[i] != -1) {
                l = left[i] + 1;
            } else {
                l = 0;
            }

            int width = r - l + 1;
            max = Math.max(max, (width * heights[i]));
        }

        return max;
    }

    public static void main(String[] args) {
        int heights[] = { 2, 1, 5, 6, 2, 3 };

    }
}
