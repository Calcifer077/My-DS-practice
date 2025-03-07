// Lunch Rush

import java.util.*;

public class _276A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        long res = Long.MIN_VALUE;
        for (long i = 0; i < n; i++) {
            long f = sc.nextLong();
            long t = sc.nextLong();

            if (t > k) {
                res = Math.max(res, f - (t - k));
            } else {
                res = Math.max(res, f);
            }
        }

        System.out.println(res);
        sc.close();
    }
}