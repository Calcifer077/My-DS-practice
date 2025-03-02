// Eating Candies

import java.util.*;

public class _1669F {
    public static void main(String[] args) {
        // Traverse from both left and right side and maintain sum for both sides.
        // If sum of left and right equals to each other, then calcualte result
        // If sum of left is more than right, then increment right with incrementing sum
        // If sum of right is more than left, then increment left with incrementing sum.

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            int start = 0;
            int end = n - 1;
            int res = Integer.MIN_VALUE;

            long leftSum = arr[0];
            long rightSum = arr[n - 1];
            // Why not 'start <= end', because both alice and bob can't eat the same candy.
            while (start < end) {
                // If both are equal
                if (leftSum == rightSum) {
                    // 'start + 1', number of candies from left. +1 because indexing is zero based.
                    // 'n - end', number of candies from right.
                    res = Math.max(res, (start + 1) + (n - end));
                }
                // If both are equal we still need to increment any one pointer otherwise it
                // will be stuck in a infinite loop.
                if (leftSum <= rightSum) {
                    start++;
                    leftSum += arr[start];
                } else if (leftSum > rightSum) {
                    end--;
                    rightSum += arr[end];
                }
            }

            System.out.println(res == Integer.MIN_VALUE ? 0 : res);
            t--;
        }
        sc.close();
    }
}