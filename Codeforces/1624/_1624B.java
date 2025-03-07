// Make AP

import java.util.*;

public class _1624B {
    public static void solve(int a, int b, int c) {
        // AP of three numbers
        // a b c
        // b - a == c - b
        // b = 2 * ( a + c)
        // a = 2 * b - c
        // c = 2 * b - a

        // If any of the above condition is met then it is possible to form an AP
        int newA = 2 * b - c;
        int newB = a + c;
        int newC = 2 * b - a;

        if (newA > 0 && newA % a == 0) {
            System.out.println("YES");
            return;
        }

        if (newB % (2 * b) == 0) {
            System.out.println("YES");
            return;
        }

        if (newC > 0 && newC % c == 0) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            solve(a, b, c);
            t--;
        }
        sc.close();
    }
}