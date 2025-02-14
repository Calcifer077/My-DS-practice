// Payment without change

import java.util.*;

public class _1256A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long n = sc.nextLong();
            long s = sc.nextLong();

            if (s % n > b) {
                System.out.println("NO");
            } else {
                if (((n * a) + b) >= s) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
            t--;
        }
        sc.close();
    }
}