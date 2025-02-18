public class minimum_number_of_operations_to_move_all_balls_to_each_box {
    public static int minCost(String boxes, int i) {
        int res = 0;
        if (i > 0) {
            for (int j = 0; j < i; j++) {
                if (boxes.charAt(j) == '1') {
                    res += Math.abs(j - i);
                }
            }
        }

        for (int j = i; j < boxes.length(); j++) {
            if (boxes.charAt(j) == '1') {
                res += Math.abs(j - i);
            }
        }

        return res;
    }

    public static int[] minOperations(String boxes) {
        /*
         * 
         * int n = boxes.length();
         * 
         * int arr[] = new int[n];
         * 
         * // For each box we have to calculate distance of '1'.
         * // Brute force
         * // Check for each element
         * 
         * for (int i = 0; i < boxes.length(); i++) {
         * arr[i] = minCost(boxes, i);
         * }
         * 
         * return arr;
         * 
         */

        // Optimized approach
        int n = boxes.length();

        int[] arrBox = new int[n];
        // Converting characters to integers.
        for (int i = 0; i < n; i++) {
            arrBox[i] = boxes.charAt(i) - '0';
        }

        // For counting cummulative frequencies from left and right side.
        int[] left = new int[n];
        int[] right = new int[n];

        int oneCnt = 0;
        // Left to right pass moving count
        // 'oneCnt' represents number of one encountered so far.
        oneCnt = arrBox[0];
        for (int i = 1; i < n; i++) {
            left[i] = left[i - 1] + oneCnt;

            // Increase 'oneCnt' if found '1'.
            oneCnt += arrBox[i];
        }

        // Right to left pass moving count
        oneCnt = arrBox[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            right[i] = right[i + 1] + oneCnt;
            oneCnt += arrBox[i];
        }

        // Sum the left and right
        for (int i = 0; i < n; i++) {
            arrBox[i] = left[i] + right[i];
        }

        return arrBox;
    }

    public static void main(String[] args) {

    }
}
