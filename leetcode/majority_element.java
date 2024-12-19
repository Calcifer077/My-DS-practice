package leetcode;

import java.util.*;

public class majority_element {
    public static int majorityElement(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        int res = 0;

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) > nums.length / 2) {
                res = i;
                break;
            }
        }

        return res;

    }

    public static void main(String[] args) {
        int nums[] = { 3, 2, 3 };
        System.out.println(majorityElement(nums));

    }
}