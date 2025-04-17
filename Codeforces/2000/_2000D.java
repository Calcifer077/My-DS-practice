// Right Left Wrong

import java.util.*;

public class _2000D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            // Using prefix sum for easy computation of sum
            long sum[] = new long[n];
            int arr[] = new int[n];
            arr[0] = sc.nextInt();
            sum[0] = arr[0];
            for (int i = 1; i < n; i++) {
                arr[i] = sc.nextInt();
                sum[i] = sum[i - 1] + arr[i];
            }

            String s = sc.next();
            // We have to find every other pair other than first and last 'L' and 'R',
            // because they will always be added in the result no matter the case.

            // So the greedy approach would be to sum up all the elements in between.

            int left = 0;
            int right = n - 1;
            long res = 0;
            while (left < right) {
                while (left < n && s.charAt(left) == 'R') {
                    left++;
                }

                while (right >= 0 && s.charAt(right) == 'L') {
                    right--;
                }

                if (left < right) {
                    if (left == 0) {
                        res += sum[right];
                    } else {
                        res += sum[right] - sum[left - 1];
                    }
                    left++;
                    right--;
                }
            }

            System.out.println(res);
        }
        sc.close();
    }
}