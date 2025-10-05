// Koxia and Whiteboards

import java.util.*;

public class _1770A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();

            // Always try to change the minimum.

            PriorityQueue<Long> pq = new PriorityQueue<>();

            for (int i = 0; i < n; i++) {
                long a = sc.nextLong();
                pq.add(a);
            }

            for (int i = 0; i < m; i++) {
                long b = sc.nextLong();

                pq.remove();
                pq.add(b);
            }

            long sum = 0;
            while (!pq.isEmpty()) {
                sum += pq.remove();
            }

            System.out.println(sum);
        }
        sc.close();
    }
}