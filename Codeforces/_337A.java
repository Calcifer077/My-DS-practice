// Puzzles

import java.util.*;

public class _337A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[] = new int[m];
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int min = arr[n - 1] - arr[0];
        for (int i = 0; i <= m - n; i++) {
            min = Math.min(arr[i + n - 1] - arr[i], min);
        }

        System.out.println(min);
        sc.close();

    }
}