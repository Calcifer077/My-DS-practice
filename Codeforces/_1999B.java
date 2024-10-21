// Card Game

import java.util.*;

public class _1999B {
    public static int solve(int a, int b) {
        if (a > b)
            return 1;
        if (a < b)
            return -1;

        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();

            int res = 0;

            if (solve(a, c) + solve(b, d) > 0)
                res++;
            if (solve(a, d) + solve(b, c) > 0)
                res++;
            if (solve(b, c) + solve(a, d) > 0)
                res++;
            if (solve(b, d) + solve(a, c) > 0)
                res++;

            System.out.println(res);

            t--;
        }
        sc.close();
    }
}