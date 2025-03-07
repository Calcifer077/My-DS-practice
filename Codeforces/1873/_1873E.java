// Building an aquarium

import java.util.*;

public class _1873E {
    // To calculate the amount of water that can be stored.
    public static long calcWater(int[] arr, long h, int n) {
        long res = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] >= h) {
                break;
            }

            res += h - arr[i];
        }

        return res;
    }

    public static long solve(int arr[], int w, int n) {
        // We are doing a binary search here from 1 to maximum element in arr.

        // If the answer is more than maximum element then that case is handled
        // sperately in the below if condition.
        int start = 1;
        int end = arr[arr.length - 1];
        long maxWater = calcWater(arr, end, n);

        // If even the maximum height can't contain all the water that is asked.
        if (w > maxWater) {
            long a = w - maxWater;
            return end + a / n;
        }

        while (start <= end) {
            int mid = (start + end) / 2;
            long water = calcWater(arr, mid, n);

            // If the water is more than the threshold then we will decrease height of
            // container as we will need less water.
            if (water > w) {
                end = mid - 1;
            } else {
                // If we need more water then we increase the height of container.
                start = mid + 1;
            }
        }

        // As we need the maximum height that is just below the requirement.
        return end;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int w = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);

            System.out.println(solve(arr, w, n));

            t--;
        }
        sc.close();
    }
}