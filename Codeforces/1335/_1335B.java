// Construct the string

import java.util.*;

public class _1335B {
    public static void solve(int n, int a, int b) {
        if (b == 1) {
            for (int i = 0; i < n; i++) {
                System.out.print("a");
            }
        } else {
            int j = 0;
            for (int i = 0; i < n; i++) {
                int k = 97 + j;
                System.out.print((char) k);
                j++;
                if (j == b) {
                    j = 0;
                }
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            solve(n, a, b);
            t--;
        }
        sc.close();
    }
}