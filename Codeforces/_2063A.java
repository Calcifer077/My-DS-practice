// Minimal update

import java.util.*;

public class _2063A {
    public static int solve(int a, int b) {
        if (a == 1 && b == 1) {
            return 1;
        } else if (a == b) {
            return 0;
        }
        return b - a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            System.out.println(solve(a, b));
            t--;
        }
        sc.close();
    }
}