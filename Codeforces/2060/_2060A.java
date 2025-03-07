// Fibonacciness

import java.util.*;

public class _2060A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int a1 = sc.nextInt();
            int a2 = sc.nextInt();
            int a4 = sc.nextInt();
            int a5 = sc.nextInt();

            // a1 + a2 = x;
            // a2 + x = a4;
            // x + a4 = a5;

            int max = 0;
            for (int i = -1000; i < 1000; i++) {
                int curr = 0;
                if (a1 + a2 == i) {
                    curr++;
                }

                if (a2 + i == a4) {
                    curr++;
                }

                if (i + a4 == a5) {
                    curr++;
                }

                max = Math.max(curr, max);
            }

            System.out.println(max);
            t--;
        }
        sc.close();
    }
}