package leetcode;

public class check_if_array_is_sorted_and_rotated {
    public static boolean check(int[] nums) {
        int pos = -1;
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] > nums[i + 1]) {
                pos = i + 1;
                break;
            }
        }

        if (pos != -1) {
            for (int i = pos; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    return false;
                }
            }
        }

        if (pos != -1) {
            if (nums[nums.length - 1] > nums[0]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 5, 6, 1, 2, 3, 4 };
        System.out.println(check(nums));
    }
}
