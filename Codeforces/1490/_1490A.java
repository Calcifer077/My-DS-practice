// Dense Array

import java.util.*;

public class _1490A {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long res = 0;

            for (int i = 0; i < n - 1; i++) {
                int max = Math.max(arr[i], arr[i + 1]);
                int min = Math.min(arr[i], arr[i + 1]);

                while (max > 2 * min) {
                    res++;
                    min *= 2;
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
}