// Powering the Hero (easy version)

import java.util.*;

public class _1800C2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            PriorityQueue<Integer> p = new PriorityQueue<>((a, b) -> b - a);
            long sum = 0;

            for (int i = 0; i < n; i++) {
                int a = sc.nextInt();

                if (a > 0) {
                    p.add(a);
                } else {
                    if (p.size() > 0) {
                        sum += p.poll();
                    }
                }
            }

            System.out.println(sum);
        }
        sc.close();
    }
}