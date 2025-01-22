package leetcode;

import java.util.*;

public class intersection_of_two_arrays_II {
    public static int[] intersect(int[] nums1, int[] nums2) {
        // In this question we have to take the values the number of times it reapeats
        // in both arrays.
        // So we can take the minimum of the two values which are common.
        ArrayList<Integer> list = new ArrayList<>();

        // For counting the frequency of elements in each table.
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();

        for (int i = 0; i < nums1.length; i++) {
            if (map1.containsKey(nums1[i])) {
                map1.put(nums1[i], map1.get(nums1[i]) + 1);
            } else {
                map1.put(nums1[i], 1);
            }
        }

        for (int i = 0; i < nums2.length; i++) {
            if (map2.containsKey(nums2[i])) {
                map2.put(nums2[i], map2.get(nums2[i]) + 1);
            } else {
                map2.put(nums2[i], 1);
            }
        }

        // Traversing the map which have minimum size.
        if (map1.size() < map2.size()) {
            for (int i : map1.keySet()) {
                if (map2.containsKey(i)) {
                    int min = Math.min(map1.get(i), map2.get(i));
                    for (int j = 0; j < min; j++) {
                        list.add(j);
                    }
                }
            }
        } else {
            for (int i : map2.keySet()) {
                if (map1.containsKey(i)) {
                    int min = Math.min(map1.get(i), map2.get(i));
                    for (int j = 0; j < min; j++) {
                        list.add(j);
                    }
                }
            }
        }

        int res[] = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        int nums1[] = { 1, 2, 2, 1 };
        int nums2[] = { 2, 2 };
        System.out.println(intersect(nums1, nums2));
    }
}
