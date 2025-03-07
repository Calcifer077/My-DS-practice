// Xenia and ringroad

import java.util.*;

public class _339B {
    public static long solve(int arr[], int n) {
        long res = 0;
        res += arr[0] - 1;

        // It basically works on one principle.
        // If the current house value is small than the next house, then we can simply
        // go that house but if that is not the case, current house value is more than
        // the next house, then we have to go around the complete circle again as we
        // can't go back.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > arr[i - 1]) {
                res += arr[i] - arr[i - 1];
            } else if (arr[i] < arr[i - 1]) {
                res += (n - arr[i - 1]) + arr[i];
            }
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];

        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(solve(arr, n));

        sc.close();
    }
}