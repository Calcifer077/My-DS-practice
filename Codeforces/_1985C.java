// Good prefixes

import java.util.*;

public class _1985C {
    // In this question we are asked to check for number of good prefixes.
    // A good prefix is the one which is equal to the sum of all elements in that
    // prefix without including itself.
    // One thing is clear that this can be only possible when it is the maximum
    // value in that prefix.
    // So we will check if max[i] - pre[i] == max[i]. In this we are removing the
    // maximum element and checking if the sum is still equal to maximum which will
    // mean that this is a good prefix.
    public static int solve(int n, int arr[], long pre[], long max[]) {
        if (n == 1) {
            if (arr[0] == 0) {
                return 1;
            } else {
                return 0;
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (max[i] == pre[i] - max[i]) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            // Prefix sum
            long pre[] = new long[n];

            // Max until a certain point
            long max[] = new long[n];
            arr[0] = sc.nextInt();
            pre[0] = arr[0];
            max[0] = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextInt();
                pre[i] = arr[i] + pre[i - 1];
                max[i] = Math.max(arr[i], max[i - 1]);
            }

            System.out.println(solve(n, arr, pre, max));
            t--;
        }
        sc.close();
    }
}