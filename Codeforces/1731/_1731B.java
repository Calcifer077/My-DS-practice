// Kill Demodogs

import java.util.*;

public class _1731B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();

            long mod = (long) 1e9 + 7;

            System.out.println((((337 * n) % mod * (n + 1)) % mod * (4 * n - 1)) % mod);
        }
        sc.close();
    }
}