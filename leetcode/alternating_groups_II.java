public class alternating_groups_II {
    public static boolean check(int[] colors, int pos, int k) {
        int count = 0;

        int n = colors.length;

        int i = pos;
        while (count < k - 1) {
            int curr = i;
            if (curr == n) {
                i = 0;
                curr = 0;
            }
            int next = curr + 1;

            if (next >= n) {
                next = 0;
            }

            if (colors[curr] == colors[next]) {
                // System.out.println(colors[curr] + " " + colors[next] + " " + pos + " " + curr
                // + " " + next);
                return false;
            }
            i++;
            count++;
        }

        return true;
    }

    public static int numberOfAlternatingGroups(int[] colors, int k) {
        // Brute force
        /*
         * 
         * int res = 0;
         * int n = colors.length;
         * 
         * for (int i = 0; i < n; i++) {
         * if (check(colors, i, k))
         * res++;
         * }
         * 
         * return res;
         */

        // Optimized
        int n = colors.length;

        // To achieve a circular array
        int[] temp = new int[n + k - 1];
        // Copy the first 'n' element into 'temp'
        System.arraycopy(colors, 0, temp, 0, n);
        // Copy first 'k' elements into 'temp'
        System.arraycopy(colors, 0, temp, n, k - 1);

        int count = 0;
        int left = 0;

        for (int right = 0; right < temp.length; right++) {
            // If two adjacent elements are equal.
            if (right > 0 && temp[right] == temp[right - 1]) {
                left = right;
            }

            // When window size reaches 'k'.
            if (right - left + 1 >= k) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int colors[] = { 0, 1, 0, 0, 1, 0, 1 };
        System.out.println(numberOfAlternatingGroups(colors, 6));
    }
}
