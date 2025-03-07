// Sending messages

import java.util.*;

public class _1921C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            long f = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long arr[] = new long[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextLong();
            }

            boolean flag = true;

            // Every point we have two choices either turn off the phone or let it stay on
            // so that its battery will reduce by 'a'. In the first case battery will reduce
            // by 'b'.

            // Now, the questio says whether we will be able to send all messages or not, if
            // the battery 'f' ever goes below or equal to 0.

            // At every point we have to take the min of letting the phone stay on or
            // turning it off.
            f -= Math.min(arr[0] * a, b);
            if (f <= 0) {
                flag = false;
            } else {
                for (int i = 1; i < n; i++) {
                    f -= Math.min((arr[i] - arr[i - 1]) * a, b);
                    if (f <= 0) {
                        flag = false;
                        break;
                    }
                }
            }

            if (flag)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }
        sc.close();
    }
}