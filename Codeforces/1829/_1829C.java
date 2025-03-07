// Mr. Perfectly fine

import java.util.*;

public class _1829C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[2 * n];
            n = 2 * n;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long min1 = Integer.MAX_VALUE;
            long min2 = Integer.MAX_VALUE;
            long min3 = Integer.MAX_VALUE;
            for (int i = 0; i < n; i = i + 2) {
                if (arr[i + 1] == 01) {
                    min1 = Math.min(min1, arr[i]);
                }

                if (arr[i + 1] == 10) {
                    min2 = Math.min(min2, arr[i]);
                }

                if (arr[i + 1] == 11) {
                    min3 = Math.min(min3, arr[i]);
                }
            }

            int ans = (int) Math.min((min1 + min2), min3);
            if (min3 == Integer.MAX_VALUE && (min1 == Integer.MAX_VALUE || min2 == Integer.MAX_VALUE)) {
                System.out.println(-1);
            } else {
                System.out.println(ans);
            }
            t--;
        }
        sc.close();
    }
}