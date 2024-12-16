// Battle for survive

import java.util.*;

public class _2013B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long res = 0;
            for (int i = 0; i < n - 2; i++) {
                res += arr[i];
            }

            res += arr[n - 1];
            System.out.println(res - arr[n - 2]);

            t--;
        }
        sc.close();
    }
}