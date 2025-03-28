// Mainak and Array

import java.util.*;

public class _1726A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            int globalMax = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
            }

            for (int i = n - 1; i >= 1; i--) {
                globalMax = Math.max(globalMax, arr[i - 1] - arr[i]);
            }

            // You can only rotate, not sort the elements
            globalMax = Math.max(globalMax, arr[n - 1] - min);
            globalMax = Math.max(globalMax, max - arr[0]);
            globalMax = Math.max(globalMax, arr[n - 1] - arr[0]);

            System.out.println(globalMax);
        }
        sc.close();
    }
}