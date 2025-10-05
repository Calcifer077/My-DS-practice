// Make Array Good

import java.util.*;

public class _1762B {
    public static long solve(long x) {
        long curr = 1;
        while (curr <= x) {
            curr *= 2;
        }

        return curr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // Converting everything to the power of 2.
            // There always exist a power of 2 in the range [x, 2x] for any x.
            int n = sc.nextInt();

            System.out.println(n);
            for (int i = 1; i <= n; i++) {
                long x = sc.nextLong();

                System.out.println(i + " " + (solve(x) - x));
            }

        }
        sc.close();
    }
}