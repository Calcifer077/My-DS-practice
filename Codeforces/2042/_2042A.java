// Greedy Monocarp

import java.util.*;

public class _2042A {

    public static int solve(int arr[], int max, int k) {
        if (max == k) {
            return 0;
        }

        int res = k;

        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] <= res) {
                res -= arr[i];
            } else {
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int coins[] = new int[n];

            int max = Integer.MIN_VALUE;
            for (int i = 0; i < n; i++) {
                coins[i] = sc.nextInt();

                max = Math.max(max, coins[i]);
            }

            Arrays.sort(coins);

            System.out.println(solve(coins, max, k));

            t--;
        }
        sc.close();
    }
}