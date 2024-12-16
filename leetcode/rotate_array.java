package leetcode;

public class rotate_array {
    // Approach 1
    // public static void rotate(int[] nums, int k) {
    // if (k == 0) {
    // return;
    // }
    // k = k % nums.length;

    // if (k > nums.length) {
    // return;
    // }

    // int temp[] = new int[nums.length];

    // int j = 0;
    // for (int i = nums.length - k; i < nums.length; i++) {
    // temp[j] = nums[i];
    // j++;
    // }

    // for (int i = 0; i <= nums.length - k - 1; i++) {
    // temp[j] = nums[i];
    // j++;
    // }

    // for (int i = 0; i < temp.length; i++) {
    // System.out.println(temp[i]);
    // }
    // }

    public static void reverse(int nums[], int start, int end) {
        while (start <= end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;

            start++;
            end--;
        }
    }

    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }

        k = k % nums.length;
        if (k > nums.length) {
            return;
        }
        reverse(nums, 0, nums.length - 1);

        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        // int nums[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate(nums, 3);
    }
}
