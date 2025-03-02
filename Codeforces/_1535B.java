// Array reordering

import java.util.*;

public class _1535B {
    public static int gcd(int a, int b) {
        if (b == 0)
            return a;

        return gcd(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            int res = 0;

            // Just check for all pairs
            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (gcd(arr[i], 2 * arr[j]) > 1 || gcd(arr[j], 2 * arr[i]) > 1) {
                        res++;
                    }
                }
            }

            System.out.println(res);
            t--;
        }
        sc.close();
    }
}