// MKnez's ConstructiveForces Task

import java.util.*;

public class _1779B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();

            if (n == 3) {
                System.out.println("NO");
            } else if (n % 2 == 0) {
                System.out.println("YES");
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 0) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(-1 + " ");
                    }
                }
                System.out.println();
            } else {
                System.out.println("YES");
                int k = (n - 1) / 2;
                for (int i = 0; i < n; i++) {
                    if (i % 2 == 1) {
                        System.out.print(-k + " ");
                    } else {
                        System.out.print(k - 1 + " ");
                    }
                }
                System.out.println();
            }
        }
        sc.close();
    }
}