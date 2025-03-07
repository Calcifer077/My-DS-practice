// Multiplication Table

import java.util.*;

public class _577A {
    public static long findFactors(int n, int x) {
        long ans = 0;

        int s = (int) Math.sqrt(x);

        // Below is a algorithm for finding factors.
        for (int i = 1; i <= s; i++) {
            if (x % i == 0) {
                int a = i;
                int b = x / i;

                if (a != b) {
                    // If both comes under 'n' then we incremnt otherwise that answer won't exist in
                    // our matrix.
                    if (a <= n && b <= n) {
                        ans += 2;
                    }
                } else {
                    // If both are equal then we need to increment by 1 only.
                    if (a <= n) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        // Need to find factor of x and if a pair of factors of x exists then we will
        // increment answer by 2.
        // If both factors are similar then we increment ans by 1;
        System.out.println(findFactors(n, x));
        sc.close();
    }
}