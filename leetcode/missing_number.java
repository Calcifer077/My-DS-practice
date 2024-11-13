package leetcode;

import java.util.*;

public class missing_number {
    public static int missingNumber(int[] nums) {
        int arr[] = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            arr[nums[i]]++;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                return i;
            }
        }

        return 0;
    }

    public static void main(String[] args) {
        int nums[] = { 9, 6, 4, 2, 3, 5, 7, 0, 1 };
        System.out.println(missingNumber(nums));
    }
}
