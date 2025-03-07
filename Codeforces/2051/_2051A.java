// Preparing for the olympiad

import java.util.*;

public class _2051A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr1[] = new int[n];
            int arr2[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr1[i] = sc.nextInt();
            }

            for (int i = 0; i < n; i++) {
                arr2[i] = sc.nextInt();
            }

            int res = 0;
            for (int i = 0; i < n; i++) {
                int diff = 0;
                if (i == n - 1) {
                    res += arr1[i];
                } else {
                    diff = arr1[i] - arr2[i + 1];

                    if (diff > 0) {
                        res += diff;
                    }
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}