import java.util.*;

public class summary_ranges {
    public static List<String> summaryRanges(int[] nums) {
        List<String> res = new ArrayList<>();

        if (nums.length < 1) {
            return res;
        }

        int count = 0;
        int start = nums[0];
        for (int i = 0; i < nums.length - 1; i++) {
            // If their difference is 1 then that means that are continous.
            if (nums[i] == nums[i + 1] - 1) {
                count++;
            } else {
                // If there is something that can be included, meaning that there can be some
                // ranges.
                if (count > 0) {
                    res.add(start + "->" + nums[i]);
                } else {
                    res.add(nums[i] + "");
                }
                start = nums[i + 1];
                count = 0;
            }
        }

        // To add the last element.
        if (count == 0) { // If last element doesn't form a range with anyone.
            res.add(nums[nums.length - 1] + "");
        } else { // If it forms a range with any other element.
            res.add(start + "->" + nums[nums.length - 1]);
        }

        return res;
    }

    public static void main(String[] args) {
        // int nums[] = { 0, 1, 2, 4, 5, 7 };
        // int nums[] = { 0, 2, 3, 4, 6, 8, 9 };
        int nums[] = { 0 };
        System.out.println(summaryRanges(nums));
    }
}
