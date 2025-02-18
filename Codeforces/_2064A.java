// Brogramming Contest

import java.util.*;

public class _2064A {
    public static int solve(String s, int n) {
        int ans = 0;
        for (int i = 0; i < n - 1; i++) {
            if (s.charAt(i) != s.charAt(i + 1))
                ans++;
        }

        if (s.charAt(0) == '1')
            ans++;

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            String s = sc.next();

            System.out.println(solve(s, n));

        }

        sc.close();
    }
}
