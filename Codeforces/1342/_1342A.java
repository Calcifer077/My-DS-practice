// Road to Zero

import java.util.Scanner;

public class _1342A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();

            long a = sc.nextLong();
            long b = sc.nextLong();

            b = Math.min(b, a + a);

            if (x < y) {
                long temp = x;
                x = y;
                y = temp;
            }
            System.out.println(y * b + (x - y) * a);
            t--;
        }
        sc.close();
    }
}
