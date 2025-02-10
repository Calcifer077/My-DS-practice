// Bad boy

import java.util.*;

public class _1537B {
    public static void solve(int n, int m, int i, int j) {
        if (i == 1 && j == 1) {
            System.out.println(1 + " " + m + " " + n + " " + 1);
        } else {
            System.out.println(1 + " " + 1 + " " + n + " " + m);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int i = sc.nextInt();
            int j = sc.nextInt();

            solve(n, m, i, j);
            t--;
        }
        sc.close();
    }
}