
public class count_subarrays_of_length_three_with_a_condition {
    public static int countSubarrays(int[] nums) {
        int res = 0;

        int i = 0;
        int j = 0;
        for (i = 0, j = i + 2; i < nums.length && j < nums.length; i++, j++) {
            if (nums[i] + nums[j] == nums[i + 1] / 2) {
                res++;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 0, 0, 0, 0 };
        System.out.println(countSubarrays(nums));
    };

}
