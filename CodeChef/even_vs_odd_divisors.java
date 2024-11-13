package CodeChef;

import java.util.*;

public class even_vs_odd_divisors {

    public static void solve(int n) {
        int odd = 0;
        int even = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (i % 2 == 0) {
                    even++;
                } else {
                    odd++;
                }
            }
        }

        if (odd == even) {
            System.out.println(0);
        } else if (even > odd) {
            System.out.println(1);
        } else {
            System.out.println(-1);
        }
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
