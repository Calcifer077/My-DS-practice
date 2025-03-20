// The third side

import java.util.*;

public class _2074B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            long arr[] = new long[n];
            long sum = 0;
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
                sum += arr[i];
            }

            if (n == 1) {
                System.out.println(arr[0]);
            } else {
                sum -= n - 1;
                System.out.println(sum);
            }
        }
        sc.close();
    }
}