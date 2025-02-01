public class minimum_size_subarray_sum {
    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;

        if (n == 1) {
            if (nums[0] >= target) {
                return 1;
            } else {
                return 0;
            }
        }

        int i = 0;
        int j = 0;
        int sum = 0;

        // How below approach works?
        // We will have two pointers. 'i' represents left, 'j' represents right.
        // When we increment 'j' we will add nums[j] to the sum
        // When we increment 'i' we will subtract nums[i] from the sum

        // We will check at each point wheter the sum >= target if so calculate the
        // length of that particular substring.
        int res = Integer.MAX_VALUE;
        while (j < n) {
            sum += nums[j];
            while (sum >= target) {
                res = Math.min(res, j - i + 1);
                sum -= nums[i];
                i++;
            }
            j++;

        }

        if (res == Integer.MAX_VALUE) {
            return 0;
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 2, 3, 1, 2, 4, 3 };
        int target = 7;
        System.out.println(minSubArrayLen(target, nums));
    }
}
