package gfg;

import java.util.*;

public class sum_pair_closest_to_target {
    public static List<Integer> sumClosest(int[] arr, int target) {
        List<Integer> list = new ArrayList<>();

        Arrays.sort(arr);

        if (arr.length <= 1) {
            return list;
        }

        int start = 0;
        int end = arr.length - 1;
        int currentDiff = Integer.MAX_VALUE;

        while (start < end) {
            int sum = arr[start] + arr[end];

            if (Math.abs(sum - target) < currentDiff) {
                list.clear();
                list.add(0, arr[start]);
                list.add(1, arr[end]);
                currentDiff = Math.abs(target - sum);
            }

            if (sum > target) {
                end--;
            } else if (sum < target) {
                start++;
            } else {
                if (Math.abs(list.get(1) - list.get(0)) < Math.abs(arr[end] - arr[start])) {
                    list.add(0, arr[start]);
                    list.add(1, arr[end]);
                }
                end--;
            }
        }

        return list;
    }

    public static void main(String[] args) {
        int arr[] = { 10, 5, 20, 30 };
        int target = 25;
        System.out.println(sumClosest(arr, target));
    }
}
