// Teleporters (Easy Version)

import java.util.*;

public class _1791G1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int c = sc.nextInt();

            int arr[][] = new int[n][2];
            for (int i = 0; i < n; i++) {
                arr[i][0] = sc.nextInt();
                arr[i][1] = i + 1;
            }

            // Creating a custom sorter
            Arrays.sort(arr, (a, b) -> {
                int aSum = a[0] + a[1];
                int bSum = b[0] + b[1];

                return Integer.compare(aSum, bSum);
            });

            int i = 0;
            int res = 0;
            while (c > 0 && i < n) {
                c -= arr[i][1];

                if (c >= arr[i][0]) {
                    c -= arr[i][0];
                    res++;
                } else {
                    break;
                }
                i++;
            }

            System.out.println(res);
        }
        sc.close();
    }
}