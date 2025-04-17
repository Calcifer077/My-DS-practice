// Perfect Team

import java.util.*;

public class _1221C {
    public static boolean solve(long a, long b, long c, long d) {
        if (a < d) {
            return false;
        }
        if (b < d) {
            return false;
        }
        if ((a + b + c) < (d * 3)) {
            return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();

            long start = 0;
            long end = Math.max(a, Math.max(b, c));

            long res = 0;
            while (start <= end) {
                long mid = start + (end - start) / 2;

                if (solve(a, b, c, mid)) {
                    res = mid;
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
}