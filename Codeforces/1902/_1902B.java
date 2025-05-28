// Getting Points

import java.util.*;

public class _1902B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long n = sc.nextLong();
            long p = sc.nextLong();
            long l = sc.nextLong();
            long x = sc.nextLong();
            // Apply greedy approach by doing more number of tasks, as monocrap can do 2
            // tasks in a single day but cano only take a single lesson.

            // Firstly calc number of tasks that he can do.
            long tasks = 1 + (n - 1) / 7;

            // Maximum number of tasks that he can do.
            long start = 1;
            long end = n;
            long ans = n + 1;

            while (start <= end) {
                long mid = start + (end - start) / 2;

                long workThatCanBeDone = (mid * l + Math.min(tasks, 2 * mid) * x);

                if (workThatCanBeDone >= p) {
                    end = mid - 1;
                    ans = mid;
                } else {
                    start = mid + 1;
                }

            }

            System.out.println(Math.abs(n - ans));

        }
        sc.close();
    }

}