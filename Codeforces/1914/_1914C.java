// Quests

import java.util.*;

public class _1914C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int[] a = new int[n];
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            int[] b = new int[n];
            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            long answer = 0;
            long currentSum = 0;
            long maxB = 0;

            // Try stopping at each position and compute the maximum experience
            for (int i = 0; i < Math.min(n, k); i++) {
                currentSum += a[i];
                maxB = Math.max(maxB, b[i]);

                // Calculate experience if we stop at this quest and repeat it
                long repeats = k - (i + 1);
                long totalExp = currentSum + (repeats * maxB);

                answer = Math.max(answer, totalExp);
            }

            System.out.println(answer);
        }
        sc.close();
    }
}