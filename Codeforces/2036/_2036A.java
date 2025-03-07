// Quintomania

import java.util.*;

public class _2036A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            boolean res = true;
            for (int i = 0; i < n - 1; i++) {
                if (Math.abs(arr[i] - arr[i + 1]) != 5 && Math.abs(arr[i] - arr[i + 1]) != 7) {
                    res = false;
                }
            }

            if (res) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}