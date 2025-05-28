// Permutation Warm-Up

import java.util.*;

public class _2108A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            int count = n;
            long sum = 0;
            for (int i = 1; i <= n; i++) {
                sum += Math.abs(count - i);
                count--;
            }

            System.out.println((sum / 2) + 1);

        }
        sc.close();
    }
}