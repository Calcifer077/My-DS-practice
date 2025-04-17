// Paint the Array

import java.util.*;

public class _1618C {
    public static long gcd(long a, long b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            long a = 0;
            long b = 0;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    a = gcd(a, arr[i]);
                } else {
                    b = gcd(b, arr[i]);
                }
            }

            boolean odd = true;
            boolean even = true;

            for (int i = 0; i < n; i++) {
                if (i % 2 == 0 && arr[i] % b == 0) {
                    even = false;
                }
                if (i % 2 == 1 && arr[i] % a == 0) {
                    odd = false;
                }
            }

            if (odd) {
                System.out.println(a);
            } else if (even) {
                System.out.println(b);
            } else {
                System.out.println(0);
            }
        }
        sc.close();
    }
}