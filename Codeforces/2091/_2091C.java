// Combination Lock

import java.util.*;

public class _2091C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                System.out.println(-1);
            } else {
                int ans[] = new int[n + 1];

                int count = 0;
                for (int i = 1; i <= n; i++) {
                    ans[(i + count) % n + 1] = i;
                    count++;
                }

                for (int i = 1; i <= n; i++) {
                    System.out.print(ans[i] + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}