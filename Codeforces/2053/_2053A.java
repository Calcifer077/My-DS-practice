// Tender carpenter

import java.util.*;

public class _2053A {
    public static void solve(int arr[]) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (Math.abs(arr[i] - arr[i + 1]) < Math.min(arr[i], arr[i + 1])) {
                System.out.println("YES");
                return;
            }
            if (arr[i] == arr[i + 1]) {
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
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

            solve(arr);

            t--;
        }
        sc.close();
    }
}