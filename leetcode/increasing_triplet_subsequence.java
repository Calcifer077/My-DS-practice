public class increasing_triplet_subsequence {
    public static boolean increasingTriplet(int[] nums) {
        /*
         * 
         * int n = nums.length;
         * for (int i = 0; i < n; i++) {
         * for (int j = i + 1; j < n; j++) {
         * if (nums[i] >= nums[j]) {
         * continue;
         * }
         * for (int k = j + 1; k < n; k++) {
         * if (nums[i] < nums[j] && nums[j] < nums[k]) {
         * return true;
         * }
         * }
         * }
         * }
         * return false;
         */

        if (nums.length < 3) {
            return false;
        }

        int n = nums.length;
        int a = Integer.MAX_VALUE; // minimum value
        int b = Integer.MAX_VALUE; // Second minimum value

        for (int i = 0; i < n; i++) {
            if (nums[i] <= a) {
                a = nums[i];
            } else if (nums[i] <= b) {
                b = nums[i];
            } else {
                // If there is a value which is smaller than both 'a' and 'b'
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 4, 5 };
        System.out.println(increasingTriplet(nums));
    }
}
