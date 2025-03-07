// Find and replace

import java.util.*;

public class _1807C {

    public static void solve(String str, int n) {
        if (n == 1) {
            System.out.println("YES");
            return;
        }

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j = j + 2) {
                if (str.charAt(i) == str.charAt(j)) {
                    System.out.println("NO");
                    return;
                }
            }
        }

        System.out.println("YES");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            String str = sc.next();

            solve(str, n);
            t--;
        }
        sc.close();
    }
}