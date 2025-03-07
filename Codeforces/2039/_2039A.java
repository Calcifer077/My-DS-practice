// Shohag loves MOD

import java.util.*;

public class _2039A {
    public static void solve(int n) {
        if (n == 1) {
            System.out.println(2);
            return;
        }
        if (n == 2) {
            System.out.println(2 + " " + 3);
            return;
        }

        System.out.print(2 + " " + 3);
        int res = 5;
        for (int i = 2; i < n; i++) {
            System.out.print(" " + res);
            res += 2;
        }

        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            solve(n);
            t--;
        }
        sc.close();
    }
}