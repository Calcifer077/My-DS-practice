// Harder problem

import java.util.*;

public class _2044D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int avail[] = new int[n + 1];

            for (int i = 0; i < n; i++) {
                if (avail[arr[i]] == 0) {
                    System.out.print(arr[i] + " ");
                    avail[arr[i]] = 1;
                }
            }
            for (int i = 1; i <= n; i++) {
                if (avail[i] == 0) {
                    System.out.print(i + " ");
                }
            }

            System.out.println();
            t--;
        }
        sc.close();
    }
}