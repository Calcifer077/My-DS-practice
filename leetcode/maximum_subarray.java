package leetcode;

public class maximum_subarray {
    // Using kadane's algorithm
    // kadane's algo basically works on one principle that is that whenver the given
    // subarray sum goes less than 0 discard it. It ignores negative numbers which
    // don't contribute to the increment of the subarray
    // If the array contains only negative elements, you have to find the smallest
    // negative element, which will be the answer.
    public static int maxSubarray(int[] nums) {
        int res = 0;
        int currSum = 0;
        for (int i = 0; i < nums.length; i++) {
            currSum += nums[i];
            if (currSum < 0) {
                currSum = 0;
            } else {
                res = Math.max(currSum, res);
            }
        }

        // This will only be possible if all are negative or 0 is the highest number.
        if (res == 0) {
            res = Integer.MIN_VALUE;
            for (int i = 0; i < nums.length; i++) {
                res = Math.max(res, nums[i]);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
        System.out.println(maxSubarray(nums));
    }
}
