public class removing_minimum_and_maximum_from_array {
    public int minimumDeletions(int[] nums) {
        int res = Integer.MAX_VALUE;

        int n = nums.length;

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int minPos = -1;
        int maxPos = -1;

        // Finding minimum and maximum value.
        for (int i = 0; i < n; i++) {
            if (nums[i] < min) {
                min = nums[i];
                minPos = i;
            }

            if (nums[i] > max) {
                max = nums[i];
                maxPos = i;
            }
        }

        // Remove both elements from front.
        res = Math.min(res, Math.max(minPos, maxPos) + 1);

        // Remove both elements from back
        res = Math.min(res, n - Math.min(minPos, maxPos));

        // Remove one element from front and another from back
        res = Math.min(res, (Math.min(minPos, maxPos) + 1) + (n - Math.max(minPos, maxPos)));
        return res;
    }
}
