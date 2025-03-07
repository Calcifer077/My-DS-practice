// The Corridor or There and Back Again

import java.util.*;

public class _1872B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int b[] = new int[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                b[i] = sc.nextInt();
            }

            int max = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                max = Math.min(max, a[i] + (int) Math.floor((b[i] - 1) / 2));
            }
            System.out.println(max);

            t--;
        }
        sc.close();
    }
}
