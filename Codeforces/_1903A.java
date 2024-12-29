// Halloumi Boxes

import java.util.*;

public class _1903A {
    public static void sovle(int arr[], int k) {
        if (arr.length == 1) {
            System.out.println("YES");
            return;
        }
        if (k <= 1) {
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            sovle(arr, k);
            t--;
        }
        sc.close();
    }
}