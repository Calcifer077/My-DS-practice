// Worms

import java.util.*;

public class _474B {
    // Applying binary search
    public static int search(long[][] arr, long target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {

            int mid = start + (end - start) / 2;

            // If target lies in the range of mid, then it is the answer.
            if (target >= arr[mid][0] && target <= arr[mid][1]) {
                return mid;
            }

            // If target is more than right side of arr[mid][1](is the upper bound), then
            // the answer is in the right half.
            if (target > arr[mid][1]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }

        }

        return arr.length;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long sum[][] = new long[n][2];

        long a = sc.nextLong();

        // Creating prefix 2d array as given in the question.
        sum[0][0] = 1;
        sum[0][1] = a;

        for (int i = 1; i < n; i++) {
            long x = sc.nextLong();
            sum[i][1] = sum[i - 1][1] + x;
            sum[i][0] = sum[i - 1][1] + 1;
        }

        long m = sc.nextLong();
        for (int i = 0; i < m; i++) {
            long x = sc.nextLong();

            System.out.println(search(sum, x) + 1);
        }

        sc.close();
    }
}