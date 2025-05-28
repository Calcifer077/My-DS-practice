// Wonderful Gloves

// Took help from editorial

import java.util.*;

public class _2096B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long k = sc.nextLong();
            long a[] = new long[n];
            long b[] = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextLong();
            }

            long max[] = new long[n];
            long min[] = new long[n];

            long res = 0;
            for (int i = 0; i < n; i++) {
                max[i] = Math.max(a[i], b[i]);
                min[i] = Math.min(a[i], b[i]);
                res += max[i];
            }

            Arrays.sort(min);

            int i = n - 1;
            k--;
            while (k > 0 && i >= 0) {
                res += min[i];
                i--;
                k--;
            }
            System.out.println(res + 1);

        }
        sc.close();
    }
}