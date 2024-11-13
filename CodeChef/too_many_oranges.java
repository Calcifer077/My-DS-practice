package CodeChef;

import java.util.*;

public class too_many_oranges {
    public static boolean solve(int n, int k) {
        if (k >= 10 * n && k <= 12 * n) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();

            if (solve(n, k)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            t--;
        }
        sc.close();
    }
}
