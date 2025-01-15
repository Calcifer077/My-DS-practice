// Minimum Product

import java.util.*;

public class _1409B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long prod1 = 1;
            long prod2 = 1;

            // decrease 'a' frist
            long temp = n;
            long a1 = a;
            long b1 = b;

            if (a1 - x < temp) {
                temp -= a1 - x;
                a1 = x;

                if (b1 - y < temp) {
                    temp -= b1 - y;
                    b1 = y;
                } else {
                    b1 -= temp;
                    temp = 0;
                }
            } else {
                a1 -= temp;
                temp = 0;
            }

            prod1 = a1 * b1;

            temp = n;
            a1 = a;
            b1 = b;

            // decreae 'b' first
            if (b1 - y < temp) {
                temp -= b1 - y;
                b1 = y;

                if (a1 - x < temp) {
                    temp -= a1 - x;
                    a1 = x;
                } else {
                    a1 -= temp;
                    temp = 0;
                }
            } else {
                b1 -= temp;
                temp = 0;
            }

            prod2 = a1 * b1;

            System.out.println(Math.min(prod1, prod2));
            t--;
        }
        sc.close();
    }
}