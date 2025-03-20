// Letters

import java.util.*;

public class _978C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long m = sc.nextLong();

        // Prefix sum.
        long pref[] = new long[n];

        pref[0] = sc.nextLong();
        for (int i = 1; i < n; i++) {
            long a = sc.nextLong();
            pref[i] = pref[i - 1] + a;
        }

        for (int i = 0; i < m; i++) {
            long b = sc.nextLong();

            // If we have to deliver the letter in the first room
            if (b <= pref[0]) {
                System.out.println(1 + " " + b);
                continue;
            }

            int start = 0;
            int end = n - 1;

            // Applying binary search
            while (start <= end) {
                int mid = start + (end - start) / 2;

                if (pref[mid] >= b) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

            System.out.println((start + 1) + " " + (b - pref[end]));
        }

        sc.close();
    }
}