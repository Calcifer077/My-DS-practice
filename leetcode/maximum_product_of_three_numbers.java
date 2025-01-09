package leetcode;

import java.util.Arrays;

public class maximum_product_of_three_numbers {
    public static int maximumProduct(int[] nums) {
        // if (nums.length <= 3) {
        // return nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];
        // }

        Arrays.sort(nums);

        int a = nums[0] * nums[1] * nums[nums.length - 1];
        int b = nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3];

        return Math.max(a, b);
    }

    public static void main(String[] args) {
        int nums[] = { -1, -2, 1, 2, 3 };
        System.out.println(maximumProduct(nums));
    }
}
