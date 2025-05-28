// Clockwork

import java.util.*;

public class _2062B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            boolean flag = true;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();

                if (arr[i] <= 2 * Math.max(i, n - i - 1)) {
                    flag = false;
                }
            }

            if (flag) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}