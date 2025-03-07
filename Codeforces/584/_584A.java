
// Olesya and Rodion
import java.util.*;

public class _584A {
    public static void solve(int n, int t) {
        // Number less than 10 are not divisible by 10.
        if (n == 1 && t == 10) {
            System.out.println(-1);
            return;
        }

        // Firstly printing 't' then printing n - 1 times zero as it will make sure that
        // number is divisible by t.
        System.out.print(t);
        if (t != 10) {
            for (int i = 1; i < n; i++) {
                System.out.print(0);
            }
        } else {
            for (int i = 2; i < n; i++) {
                System.out.print(0);
            }
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();

        solve(n, t);

        sc.close();
    }
}