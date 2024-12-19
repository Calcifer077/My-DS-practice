package leetcode;

import java.util.*;;

public class square_of_a_sorted_array {
    public static int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int res[] = new int[nums.length];
        int j = nums.length - 1;
        while (start <= end) {
            if (Math.abs(nums[start]) <= Math.abs(nums[end])) {
                res[j] = nums[end] * nums[end];
                end--;
                j--;
            } else {
                res[j] = nums[start] * nums[start];
                start++;
                j--;
            }
        }

        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }

        return nums;
    }

    public static void main(String[] args) {
        int nums[] = { -4, -1, 0, 3, 10 };
        sortedSquares(nums);
    }
}
