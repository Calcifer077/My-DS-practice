package leetcode;

public class single_number {
    public static int singleNumber(int[] nums) {
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            res = res ^ nums[i];
            System.out.println(res + " " + nums[i]);
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 1, 2, 1, 2, 3, 5, 3, 5 };
        System.out.println(singleNumber(nums));
    }
}
