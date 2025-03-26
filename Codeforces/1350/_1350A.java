// Orac and Factors

import java.util.*;

public class _1350A {
    public static long solve(long n) {
        // If number is even then the smallest divisor will be 2 after 1.
        if (n % 2 == 0) {
            return 2;
        }

        long a = n / 2;
        // If it is divisible by some number until n / 2, because after that it will be
        // a prime number
        for (int i = 2; i <= a; i++) {
            if (n % i == 0) {
                return i;
            }
        }

        // The number was prime
        return n;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long k = sc.nextLong();

            long res = 0;
            long temp = n;
            long a = 0;
            for (int i = 0; i < k; i++) {
                a = solve(temp);
                if (a == 2) {
                    res = temp + (k - i) * 2;
                    break;
                } else {
                    res = temp + a;
                    temp = res;
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
}