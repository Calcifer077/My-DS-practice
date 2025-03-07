// Paint a strip

import java.util.*;

public class _2040B {
    public static int solve(int n) {
        if (n < 3) {
            return n;
        }
        if (n == 3) {
            return 2;
        }

        int res = 2;
        int a = 1;
        while (res <= n) {
            a++;
            int temp = res;
            res = temp * 2;
            res++;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();

            System.out.println(solve(n));
            t--;
        }
        sc.close();
    }
}

// 1 0 0 1 0 0 0 0 0 1 0 0 0 0 0 0 0 0 0 1
// 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
//