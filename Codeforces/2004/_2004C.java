// Splitting Items

import java.util.*;

public class _2004C {
    public static void reverse(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - i - 1];
            arr[n - i - 1] = temp;
        }
    }

    public static void main(String[] args) {
        // To try to maximize the score 'Alice' will try to pick numbers with maximum
        // value.

        // Same is true for 'Bob'.
        // So the approach will be to maximize second largest element.

        // Sorting the array in reverse order, Alice will take the maximum element and
        // Bob will take the second largest element we will try to maximize this second
        // largest element trying to equate it to maximum element and traverse the array
        // in this order

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            int arr[] = new int[n];

            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }

            Arrays.sort(arr);
            reverse(arr);

            for (int i = 1; i < n; i += 2) {
                int diff = arr[i - 1] - arr[i];
                int a = Math.min(diff, k);
                arr[i] += a;
                k -= a;
            }

            long ans = 0;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    ans += arr[i];
                } else {
                    ans -= arr[i];
                }
            }

            System.out.println(ans);

        }
        sc.close();
    }
}