// Everyone loves tres

import java.util.*;

public class _2035B {

    public static void solve(int n) {
        if (n == 1 || n == 3) {
            System.out.println(-1);
            return;
        }

        if (n % 2 == 0) {
            for (int i = 0; i < n - 2; i++) {
                System.out.print(3);
            }
            System.out.println(66);
        } else {
            for (int i = 0; i < n - 5; i++) {
                System.out.print(3);
            }
            System.out.println(36366);
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