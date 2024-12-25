package leetcode;

import java.util.HashMap;

public class two_sum {
    public static int[] twoSum(int[] nums, int target) {
        int res[] = new int[2];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {

            int diff = target - nums[i];
            if (map.containsKey(diff)) {
                res[0] = i;
                res[1] = map.get(diff);
                break;
            }

            map.put(nums[i], i);
        }

        System.out.println(res[0] + " " + res[1]);
        return res;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 4 };
        twoSum(nums, 6);

    }
}
