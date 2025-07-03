// Prefix Min and Suffix Max

import java.util.*;

public class _2123C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean flag[] = new boolean[n];

            int min = Integer.MAX_VALUE;
            for (int i = 0; i < n; i++) {
                if (arr[i] < min) {
                    min = arr[i];
                    flag[i] = true;
                }
            }

            int max = Integer.MIN_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                if (arr[i] > max) {
                    max = arr[i];
                    flag[i] = true;
                }
            }

            for (int i = 0; i < n; i++) {
                if (flag[i]) {
                    System.out.print(1);
                } else {
                    System.out.print(0);
                }
            }

            System.out.println();

        }
        sc.close();
    }
}