// Square

import java.util.*;

public class _1921A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a1 = Integer.MIN_VALUE;
            int a2 = Integer.MAX_VALUE;
            int b1 = Integer.MIN_VALUE;
            int b2 = Integer.MAX_VALUE;

            for (int i = 0; i < 4; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                a1 = Math.max(a1, x);
                b1 = Math.max(b1, y);
                a2 = Math.min(a2, x);
                b2 = Math.min(b2, y);
            }

            System.out.println((a2 - a1) * (b2 - b1));
            t--;
        }
        sc.close();
    }
}