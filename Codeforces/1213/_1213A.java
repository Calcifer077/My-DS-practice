// Chips Moving

import java.util.*;

public class _1213A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (Math.abs(arr[i] - arr[j]) % 2 != 0) {
                    count++;
                }
            }

            min = Math.min(min, count);
        }

        System.out.println(min);
        sc.close();
    }
}