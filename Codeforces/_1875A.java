// Jellyfish and undertale

import java.util.*;

public class _1875A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int n = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            long res = b;
            for (int i = 0; i < n; i++) {
                res += Math.min(arr[i], a - 1);
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}