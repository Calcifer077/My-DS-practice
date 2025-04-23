// Two Divisors

import java.util.*;

public class _1916B {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();

            if (b % a == 0) {
                long res = b * (b / a);
                System.out.println(res);
            } else {
                long res = b * (a / gcd(a, b));
                System.out.println(res);
            }
        }
        sc.close();
    }
}