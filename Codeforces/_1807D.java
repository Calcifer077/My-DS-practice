// Odd queries

import java.util.*;

public class _1807D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int q = sc.nextInt();
            long arr[] = new long[n];
            long sum = 0;
            long pref[] = new long[n + 1];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                pref[i + 1] = pref[i];
                pref[i + 1] += arr[i];
            }

            for (int i = 0; i < q; i++) {
                int l = sc.nextInt();
                int r = sc.nextInt();
                int k = sc.nextInt();

                long temp = pref[n] - (pref[r] - pref[l - 1] + k * (r - l + 1));

                if (temp % 2 == 0) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }
            t--;
        }
        sc.close();
    }
}