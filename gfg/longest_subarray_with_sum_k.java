package gfg;

import java.util.*;

public class longest_subarray_with_sum_k {
    /*
     * public static int lenOfLongestSubarr(int[] arr, int target) {
     * int res = 0;
     * long sum = 0;
     * 
     * HashMap<Long, Integer> map = new HashMap<>();
     * for (int i = 0; i < arr.length; i++) {
     * sum += arr[i];
     * 
     * if (sum == target) {
     * res = Math.max(res, i + 1);
     * }
     * 
     * long rem = sum - target;
     * 
     * if (map.containsKey(rem)) {
     * int a = i - map.get(rem);
     * res = Math.max(res, a);
     * }
     * 
     * map.putIfAbsent(sum, i);
     * }
     * 
     * return res;
     * }
     */

    public static int lenOfLongestSubarr(int[] arr, int target) {
        int res = 0;
        long sum = 0;

        HashMap<Long, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            if (sum == target) {
                res = Math.max(res, i + 1);
            }

            long rem = sum - target;

            if (map.containsKey(rem)) {
                int a = i - map.get(rem);
                res = Math.max(res, a);
            }

            map.putIfAbsent(sum, i);
        }

        return res;
    }

    public static void main(String[] args) {
        // int a[] = { 10, 5, 2, 7, 1, 9 };
        // int a[] = { 1, -1, 5, -2, 3 };
        int a[] = { 2, 0, 0, 3 };
        System.out.println(lenOfLongestSubarr(a, 3));
    }
}
