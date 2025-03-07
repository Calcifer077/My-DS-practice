// Promo

import java.util.*;

public class _1697B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int q = sc.nextInt();
        long[] p = new long[n];
        long[] s = new long[n + 1];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextLong();
        }
        Arrays.sort(p);
        for (int i = 0; i < n; i++) {
            s[i + 1] = s[i] + p[i];
        }
        while (q-- > 0) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            System.out.println(s[n - x + y] - s[n - x]);
        }
        sc.close();
    }
}
