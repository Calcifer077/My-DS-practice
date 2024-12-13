// Pipeline

import java.util.*;

public class _287B {

    public static long solve(long n, long k) {
        if (n == 1) {
            return 0;
        }
        if (n <= k) {
            return 1;
        }

        long res = -1;

        long sum = k * (k + 1) / 2 - k;
        long start = 2;
        long end = k;

        while (start <= end) {
            long mid = start + (end - start) / 2;
            long sumOfRight = sum - (((mid - 1) * mid / 2) - mid);

            if (sumOfRight >= n) {
                res = k - (mid - 1);
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        System.out.println(solve(n, k));
        sc.close();
    }
}