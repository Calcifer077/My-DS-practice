// Aleksa and Stack

import java.util.*;

public class _1878B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            long arr[] = new long[n];

            arr[0] = 1;
            arr[1] = 3;

            for (int i = 2; i < n; i++) {
                arr[i] = arr[i - 1] + 2;
            }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}