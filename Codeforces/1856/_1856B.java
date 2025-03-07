// Good arrays

import java.util.*;

public class _1856B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int arr[] = new int[n];

            int count = 0;
            long sum = 0;
            // This problem revolve aruond finding the number of 1.

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
                sum += arr[i];
                if (arr[i] == 1)
                    count++;
            }

            if (sum >= count + n && n > 1) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }

            t--;
        }
        sc.close();
    }
}

// 0 1 2 3 4 5 6 7 8 9 10 11
// 1 1 1 1 1 1 1 2 2 2 2 3
// 2 2 2 2 2 2 2 1 1 1 1 2