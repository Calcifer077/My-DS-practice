// Array Recovery

import java.util.*;

public class _1739B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Try to explore all possibilites
            boolean flag = true;
            int res[] = new int[n];
            res[0] = arr[0];
            for (int i = 1; i < n; i++) {
                int a = res[i - 1] + arr[i];
                int b = res[i - 1] - arr[i];

                if (a >= 0 && b >= 0 && a != b) {
                    flag = false;
                    break;
                } else {
                    res[i] = a > b ? a : b;
                }
            }

            if (flag) {
                for (int i = 0; i < n; i++) {
                    System.out.print(res[i] + " ");
                }
                System.out.println();
            } else {
                System.out.println(-1);
            }
        }
        sc.close();
    }
}