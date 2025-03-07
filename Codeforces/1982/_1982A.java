// Soccer

import java.util.*;

public class _1982A {

    public static void solve(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            System.out.println("YES");
            return;
        }

        if (x1 == x2) {
            if ((x2 > y2 && x1 > y1) || (x2 < y2 && x1 < y1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        if (y1 == y2) {
            if ((x2 > y2 && x1 > y1) || (x2 < y2 && x1 < y1)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            return;
        }

        if ((x1 > y1 && x2 > y2) || (x1 < y1 && x2 < y2)) {
            System.out.println("YES");
            return;
        }

        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int x1 = sc.nextInt();
            int y1 = sc.nextInt();

            int x2 = sc.nextInt();
            int y2 = sc.nextInt();

            solve(x1, y1, x2, y2);
            t--;
        }
        sc.close();
    }
}