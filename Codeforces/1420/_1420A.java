// Cubes Sorting

import java.util.*;

public class _1420A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int count = 1;
            for (int i = 1; i < n; i++) {
                if (arr[i - 1] > arr[i]) {
                    count++;
                }
            }

            if (count == n) {
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }

        }
        sc.close();
    }
}