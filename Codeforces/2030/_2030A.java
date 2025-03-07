// A gift from Orangutan

import java.util.*;

public class _2030A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                max = Math.max(arr[i], max);
                min = Math.min(arr[i], min);
            }

            int res = 0;
            for (int i = 0; i < n - 1; i++) {
                res += max - min;
            }

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}