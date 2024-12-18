package CodeChef;

import java.util.*;

public class poster_perimeter {
    public static int solve(int n, int m, int k) {
        int res = Integer.MAX_VALUE;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int diff = Math.abs(k - 2 * (i + j));
                res = Math.min(res, diff);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();

            System.out.println(solve(n, m, k));

            t--;
        }
        sc.close();
    }
}