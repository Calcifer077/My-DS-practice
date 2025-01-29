// Juicer

import java.util.*;

public class _709A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int b = sc.nextInt();
        int d = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        long full = 0;
        long count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > b) {
                continue;
            }

            full += arr[i];

            if (full > d) {
                count++;
                full = 0;
            }
        }

        if (full > d) {
            count++;
        }

        System.out.println(count);
        sc.close();
    }
}