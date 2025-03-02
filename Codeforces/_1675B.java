// Make It Increasing

import java.util.*;

public class _1675B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Just brute forcing solution.
            long res = 0;
            int a = arr[n - 1];
            boolean flag = true;
            for (int i = n - 2; i >= 0; i--) {
                int b = arr[i];
                while (b >= a) {
                    b = b / 2;

                    // If 'b' becomes 0 and is still more than equal to 'a' then, that means that it
                    // will never be less than 'a' because no matter how many times you divide 0 by
                    // 2, it will still remain 0.
                    if (b == 0 && b >= a) {
                        flag = false;
                        break;
                    }
                    res++;
                }
                // For next iteration
                a = b;
            }

            if (flag)
                System.out.println(res);
            else
                System.out.println(-1);
            t--;
        }
        sc.close();
    }
}