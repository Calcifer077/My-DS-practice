import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _4sum {
    public static List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> res = new ArrayList<>();

        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            // Skipping duplicates for first number
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            long a = nums[i];
            for (int j = i + 1; j < n - 2; j++) {
                // Skipping duplicates for second number
                if (j > i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                long b = nums[j];

                int k = j + 1;
                int l = n - 1;

                while (k < l) {
                    long sum = a + b + nums[k] + nums[l];
                    if (sum == (long) target) {
                        res.add(Arrays.asList((int) a, (int) b, nums[k], nums[l]));

                        // Move pointer k and skip duplicates
                        while (k < l && nums[k] == nums[k + 1]) {
                            k++;
                        }
                        // Move pointer l and skip duplicates
                        while (k < l && nums[l] == nums[l - 1]) {
                            l--;
                        }

                        // Advance both pointers after processing the current quadruplet
                        // Here, we are advancing both pointers because after we have found a result we
                        // can't use these two numbers again as duplicates are not allowed
                        k++;
                        l--;

                    } else if (sum < target) {
                        k++;
                    } else {
                        l--;
                    }
                }
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 0, -1, 0, -2, 2 };
        int target = 0;

        System.out.println(fourSum(nums, target));
    }
}
