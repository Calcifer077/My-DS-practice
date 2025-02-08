import java.util.Arrays;

public class _3sum_closest {
    public static int threeSumClosest(int[] nums, int target) {
        int n = nums.length;
        if (n == 3) {
            return nums[0] + nums[1] + nums[2];
        }
        Arrays.sort(nums);

        int curr_sum = Integer.MAX_VALUE / 2;

        // Here, we are doing 'n-2' because we need triplets
        for (int i = 0; i < n - 2; i++) {
            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                // Fniding the one which is closest.
                if (Math.abs(sum - target) < Math.abs(curr_sum - target)) {
                    curr_sum = sum;
                }

                // As array is sorted, if sum is less than target then we need to increase this
                // sum, else we will decrease it.
                if (sum < target) {
                    j++;
                } else if (sum > target) {
                    k--;
                } else {
                    // target is found.
                    return target;
                }
            }

        }
        return curr_sum;

    }

    public static void main(String[] args) {
        int nums[] = { -1, 2, 1, -4 };
        int target = 1;

        System.out.println(threeSumClosest(nums, target));
    }
}
