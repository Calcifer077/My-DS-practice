// Letter home

import java.util.*;

public class _2121A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            if (k < arr[0]) {
                System.out.println(arr[n - 1] - k);
            } else if (k > arr[n - 1]) {
                System.out.println(k - arr[0]);
            } else if (arr[n - 1] - k < k - arr[0]) {
                int sum = 2 * (arr[n - 1] - k);
                sum += k - arr[0];

                System.out.println(Math.abs(sum));
            } else {
                int sum = 2 * (k - arr[0]);
                sum += arr[n - 1] - k;
                System.out.println(Math.abs(sum));
            }
        }
        sc.close();
    }
}