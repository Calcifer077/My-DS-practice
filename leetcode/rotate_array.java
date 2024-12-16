package leetcode;

public class rotate_array {
    public static void rotate(int[] nums, int k) {
        if (k == 0) {
            return;
        }
        k = k % nums.length;

        if (k > nums.length) {
            return;
        }

        int temp[] = new int[nums.length];

        int j = 0;
        for (int i = nums.length - k; i < nums.length; i++) {
            temp[j] = nums[i];
            j++;
        }

        for (int i = 0; i <= nums.length - k - 1; i++) {
            temp[j] = nums[i];
            j++;
        }

        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2 };
        rotate(nums, 3);
    }
}
