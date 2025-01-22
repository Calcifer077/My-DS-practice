// Make equal again

import java.util.*;

public class _1931C {
    // In this question we can modify the array only a single time to make all
    // element equal.
    public static int solve(int arr[], int n) {
        // If n == 1 then all array elements are equal.
        if (n == 1) {
            return 0;
        }

        // Our approach will always be to find the common element from either end.
        int count1 = 1;
        int count2 = 1;
        int start = arr[0];
        int end = arr[n - 1];

        // If start is equal to end then we have to dinf the not equal element that come
        // in between of them.
        if (start == end) {
            // Calculating similar element from start.
            for (int k = 1; k < n; k++) {
                if (arr[k] == start) {
                    count1++;
                } else {
                    break;
                }
            }

            // Calculating similar element from end.
            for (int k = n - 2; k >= 0; k--) {
                if (arr[k] == end) {
                    count2++;
                } else {
                    break;
                }
            }

            // If all elements are equal.
            if (count1 == n) {
                return 0;
            }

            // As elements from start and end are same then we don't have to change them and
            // only the element that are between them.
            return (n - count1 - count2);
        }

        // Calculating similar element from start.
        for (int k = 1; k < n; k++) {
            if (arr[k] == start) {
                count1++;
            } else {
                break;
            }
        }

        // Calculating similar element from end.
        for (int k = n - 2; k >= 0; k--) {
            if (arr[k] == end) {
                count2++;
            } else {
                break;
            }
        }

        // From either side whichever has more equal element consider that.
        return n - Math.max(count1, count2);
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

            System.out.println(solve(arr, n));

            t--;
        }
        sc.close();
    }
}
