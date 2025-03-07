// Restore the Weather

import java.util.*;

public class _1833B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int b[] = new int[n];

            // To store original index.
            int index[][] = new int[n][2];

            for (int i = 0; i < n; i++) {
                index[i][0] = sc.nextInt();
                index[i][1] = i;
            }

            for (int i = 0; i < n; i++) {
                b[i] = sc.nextInt();
            }

            // As the answer is always possible, we assign smallest to smallest.
            Arrays.sort(index, Comparator.comparingDouble(o -> o[0]));
            Arrays.sort(b);

            int res[] = new int[n];

            for (int i = 0; i < n; i++) {
                // To print array in original order.
                res[index[i][1]] = b[i];
            }

            for (int i = 0; i < n; i++) {
                System.out.print(res[i] + " ");
            }

            System.out.println();
            t--;
        }
        sc.close();
    }
}