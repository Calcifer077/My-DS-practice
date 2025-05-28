// Tiles Comeback

import java.util.*;

public class _1851C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            // Count the frequency of first and last element.
            // If they are less than k, then it is not possible.
            // If both are same than atleast 'k' is good enough.

            // If both are different then the first element should come before the last
            // element.

            if (arr[0] == arr[n - 1]) {
                int count = 1;
                for (int i = 1; i < n; i++) {
                    if (arr[i] == arr[0]) {
                        count++;
                    }
                }

                if (count < k) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            } else {
                int count1 = 0;
                int count2 = 0;

                int start = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == arr[0]) {
                        count1++;
                    }
                    if (count1 >= k) {
                        start = i;
                        break;
                    }
                }

                int end = -1;
                for (int i = n - 1; i >= 0; i--) {
                    if (arr[i] == arr[n - 1]) {
                        count2++;
                    }

                    if (count2 >= k) {
                        end = i;
                        break;
                    }
                }

                if (start == -1 || end == -1 || start >= end) {
                    System.out.println("NO");
                } else {
                    System.out.println("YES");
                }
            }

        }
        sc.close();
    }
}