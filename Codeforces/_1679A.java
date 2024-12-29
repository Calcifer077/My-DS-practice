// AvtoBus

import java.util.*;

public class _1679A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long n = sc.nextLong();

            if (n % 2 == 1 || n < 4) {
                System.out.println(-1);
            } else {
                System.out.println((n + 4) / 6 + " " + (n / 4));

            }
            t--;
        }
        sc.close();
    }
}