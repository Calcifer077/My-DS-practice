// Balanced round

import java.util.*;

public class _1850D {
    public static int solve(int n, int k, int arr[]) {
        int max = 1;
        int cnt = 1;
        for (int i = 1; i < n; i++) {
            if (arr[i] - arr[i - 1] > k) {
                cnt = 1;
            } else {
                cnt++;
            }
            max = Math.max(max, cnt);
        }

        return n - max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            System.out.println(solve(n, k, arr));
            t--;
        }
        sc.close();
    }
}