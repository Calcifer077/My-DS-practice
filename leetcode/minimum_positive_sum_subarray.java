
import java.util.*;

public class minimum_positive_sum_subarray {
    public static int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = -1;
        int size = nums.size();

        for (int start = l; start <= r; start++) {
            for (int i = 0; i <= size - start; i++) {
                int sum = 0;
                for (int j = i; j < i + start; j++) {
                    sum += nums.get(j);
                }

                if (sum > 0) {
                    if (ans == -1 || ans > sum)
                        ans = sum;
                }
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>(Arrays.asList(4, -10));
        int l = 1;
        int r = 1;

        System.out.println(minimumSumSubarray(nums, l, r));
    }
}
