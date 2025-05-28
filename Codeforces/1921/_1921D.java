// Very Different Array

import java.util.*;

public class _1921D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            // We have to arrange two arrays such that the sum of absolute difference of
            // those two array's element is maximum.

            // The greedy choice would be to pair smallest element with the largest element.
            // To do the above step, sort both the arrays.

            // Pair starting element from start of the first array to the end of the second
            // array.
            // Pair ending element from the end of the first arrayt to the start of the
            // second array.
            // Only consider that result which will give higher difference.

            int n = sc.nextInt();
            int m = sc.nextInt();

            int a[] = new int[n];
            int b[] = new int[m];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            for (int i = 0; i < m; i++) {
                b[i] = sc.nextInt();
            }

            Arrays.sort(a);
            Arrays.sort(b);

            long diff = 0;

            int starta = 0, enda = n - 1;
            int startb = 0, endb = m - 1;

            while (starta <= enda) {
                long first = Math.abs(a[starta] - b[endb]);
                long second = Math.abs(a[enda] - b[startb]);

                if (first > second) {
                    diff += first;
                    starta++;
                    endb--;
                } else {
                    diff += second;
                    enda--;
                    startb++;
                }
            }

            System.out.println(diff);
        }
        sc.close();
    }
}
