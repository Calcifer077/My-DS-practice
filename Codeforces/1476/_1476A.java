// k-divisible Sum

import java.util.*;

public class _1476A {

    public static int solve(int n, int k) {
        // If both are equal then the maximum will always be 1.
        if (n == k) {
            return 1;
        }

        if (n < k) {
            // If n < k, then we need to make sure that the sum of n elements is divisible
            // by k.
            // The neareast sum which will be divisible by k is k itself because n is less
            // than k.
            // Then we need to split the array equally.
            // Suppose n = 2 and k = 5
            // We have two spots to fill what is the best outcome both are 1.

            // 1 1 sum is 2 which is not divisible by 5. The next sum which is divisible by
            // 5 is 5
            // We need three more sum, to achieve that we will split 3 into our array
            // equally
            // giving us 2 3

            return (int) Math.ceil((double) k / n);
        }

        // If they are multiple of each other.
        if (n % k == 0) {
            return 1;
        }
        return 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(solve(n, k));
            t--;
        }
        sc.close();
    }
}
