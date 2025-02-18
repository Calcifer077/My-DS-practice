// XXXXX

import java.util.*;

public class _1364A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int x = sc.nextInt();
            int[] arr = new int[n];

            long sum = 0;
            int firstDiv = -1, lastDiv = -1; // Track first and last index of elements divisible by x

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];

                if (arr[i] % x != 0) { // Key observation: We need numbers NOT divisible by x
                    if (firstDiv == -1)
                        firstDiv = i;
                    lastDiv = i;
                }
            }

            // If the total sum is not divisible by x, the entire array is the answer
            if (sum % x != 0) {
                System.out.println(n);
                continue;
            }

            // If there's no element that is not divisible by x, return -1
            if (firstDiv == -1) {
                System.out.println(-1);
            } else {
                // The longest subarray is achieved by removing either prefix or suffix
                int longest = Math.max(n - firstDiv - 1, lastDiv);
                System.out.println(longest);
            }
        }
        sc.close();
    }
}
