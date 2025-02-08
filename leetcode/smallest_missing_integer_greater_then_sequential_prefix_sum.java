
import java.util.*;

public class smallest_missing_integer_greater_then_sequential_prefix_sum {
    // In this question the goal is to find the longest prefix which is sequential,
    // meaning that the difference shouldn't be more than 1, and they should be in
    // increasing order.
    // prefix means that nums[0] should be included.
    // We have to find the longest such prefix, will always start from nums[0]
    // If you have found such prefix sum them, and find the next number that is more
    // than or equal to this sum and not present in the array
    public static int missingInteger(int[] nums) {
        // Start the result with 'nums[0]'
        int res = nums[0];

        // Finding the sum of longest prefix.
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] + 1 == nums[i]) {
                res += nums[i];
            } else {
                break;
            }
        }

        Arrays.sort(nums);
        // Finding the number which is greater or equal to 'res' and not present in
        // nums.
        for (int i = 0; i < nums.length; i++) {
            if (res == nums[i]) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 3, 4, 5, 1, 12, 14, 13 };
        System.out.println(missingInteger(nums));
    }
}
